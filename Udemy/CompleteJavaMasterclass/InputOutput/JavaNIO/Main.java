package com.karmen;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) {
        try (FileOutputStream binFile = new FileOutputStream("data.dat")) {
            FileChannel binChannel = binFile.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(100);
//            byte outputBytes[] = "Hello World!".getBytes();
//            byte outputBytes2[] = "Nice to meet you".getBytes();
//            byteBuffer.put(outputBytes).putInt(245).putInt(-987654321).put(outputBytes2).putInt(1000);
//            byteBuffer.flip();

            byte outputBytes[] = "Hello World!".getBytes();
            byteBuffer.put(outputBytes);
            long intPos1 = outputBytes.length;
            byteBuffer.putInt(245);
            long intPos2 = intPos1 + Integer.BYTES;
            byteBuffer.putInt(-987654321);
            byte outputBytes2[] = "Nice to meet you".getBytes();
            byteBuffer.put(outputBytes2);
            long intPos3 = intPos2 + Integer.BYTES + outputBytes2.length;
            byteBuffer.putInt(1000);
            byteBuffer.flip();

            binChannel.write(byteBuffer);

            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);
            readBuffer.flip();
            byte inputString[] = new byte[outputBytes.length];
            readBuffer.get(inputString);
            System.out.println("input String = " + new String(inputString));
            System.out.println("int1 = " + readBuffer.getInt());
            System.out.println("int2 = " + readBuffer.getInt());
            byte inputString2[] = new byte[outputBytes2.length];
            readBuffer.get(inputString2);
            System.out.println("inputString2 = " + new String(inputString2));
            System.out.println("int3 = " + readBuffer.getInt());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
