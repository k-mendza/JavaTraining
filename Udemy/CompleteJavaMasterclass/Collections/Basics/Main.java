package udemy.completeJavaMasterclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Och", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat is already reserved");
        }

        // Collections.reverse(seatCopy);

        Collections.shuffle(seatCopy);

        System.out.println("Shuffled seatCopy");
        printList(seatCopy);

        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        /**
         *  min will always point to A01 seat even if the list is sorted the same is true for max
         */

        System.out.println("Min seat is: " + minSeat.getSeatNumber());
        System.out.println("Max seat is: " + maxSeat.getSeatNumber());

        System.out.println("Now printing sorted seatCopy ");
        sortList(seatCopy);
        printList(seatCopy);

    // end of main()
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===============================================================");
    }

    /**
     * Method for sorting the list of seats. It is important to note that it is possible
     * thanks to @Override of compare method.
     * @param list
     */

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i=0; i<list.size()-1; i++){
            for (int j=i+1; j<list.size();j++){
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
