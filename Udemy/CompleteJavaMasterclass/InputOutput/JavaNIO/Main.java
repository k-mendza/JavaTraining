package com.karmen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (FileOutputStream binFile = new FileOutputStream("data.dat")) {
            FileChannel binChannel = binFile.getChannel();
            byte outputBytes[] = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes = " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes = " + numBytes);

            intBuffer.flip(); // first flip to reset buffer position
            intBuffer.putInt(-987654321);
            intBuffer.flip(); // second flip to reset buffer position
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes = " + numBytes);

            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = randomAccessFile.getChannel();
            outputBytes[0] = 'a';
            outputBytes[1] = 'b';
            buffer.flip();
            long numBytesRead = channel.read(buffer);
            if (buffer.hasArray()) {
                System.out.println("byte buffer = " + new String(buffer.array()));
            }

            // Absolute read
            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);
            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);

            // Relative read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            channel.close();
//            randomAccessFile.close();

//            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
//            byte[] bytes = new byte[outputBytes.length];
//            randomAccessFile.read(bytes);
//            System.out.println(new String(bytes));
//
//            // reading integers
//            long int1 = randomAccessFile.readInt();
//            long int2 = randomAccessFile.readInt();
//            System.out.println(int1);
//            System.out.println(int2);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
