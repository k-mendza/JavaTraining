package udemy.completeJavaMasterclass;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<>();
    private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {


        // implementation  of RandomAccessFile which load location on demand not all at once
        try (RandomAccessFile rao = new RandomAccessFile("locations_random.dat", "rwd")) {
               rao.writeInt(locations.size());
               int indexSize = locations.size() * 3 * Integer.BYTES;
               int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
               rao.writeInt(locationStart);
               long indexStart = rao.getFilePointer();
               int startPointer = locationStart;
               rao.seek(startPointer);

               for (Location location : locations.values()){
                   rao.writeInt(location.getLocationID());
                   rao.writeUTF(location.getDescription());
                   StringBuilder builder = new StringBuilder();
                   for (String direction : location.getExits().keySet()){
                       if (!direction.equalsIgnoreCase("Q")) {
                           builder.append(direction);
                           builder.append(",");
                           builder.append(location.getExits().get(direction));
                           builder.append(",");
                       }
                   }
                   rao.writeUTF(builder.toString());

                   IndexRecord record = new IndexRecord(startPointer, (int) (rao.getFilePointer() - startPointer));
                   index.put(location.getLocationID(), record);

                   startPointer = (int) rao.getFilePointer();
               }
               rao.seek(indexStart);
               for (Integer locationID : index.keySet()){
                   rao.writeInt(locationID);
                   rao.writeInt(index.get(locationID).getStartByte());
                   rao.writeInt(index.get(locationID).getLength());
               }
        }
    }


    //1. This first four bytes will contain the number of locations (bytes 0-3)
    //2. This four bytes will contain the start offset of the locations section (bytes 4-7)
    //3. The next section of the file will contain the index (the index is 1692 bytes long)
    //   It will start at byte 8 and end at byte 1699
    //4. The final section of the fil;e will contain the location records (the data). Start at 1700


    static {
        try {
            ra = new RandomAccessFile("locations_random.dat", "rwd"); // open the file
            int numLocations = ra.readInt(); // read number of locations
            long locationStartPoint = ra.readInt(); // read offset

            while (ra.getFilePointer() < locationStartPoint) { // reading data into memory
                int locationId = ra.readInt();
                int locationStart = ra.readInt();
                int locationLength = ra.readInt();

                IndexRecord record = new IndexRecord(locationStart, locationLength);
                index.put(locationId, record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
//            boolean eof = false;
//            while (!eof) {
//                try {
//                    Location location = (Location) locFile.readObject();
//                    System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
//                    System.out.println("Found " + location.getExits().size() + " exits");
//
//                    locations.put(location.getLocationID(), location);
//                } catch (EOFException e) {
//                    eof = true;
//                }
//            }
//        } catch (InvalidClassException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
