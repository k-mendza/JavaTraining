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

            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
            channel.position(intPos3);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int3 = " + readBuffer.getInt());

            readBuffer.flip();
            channel.position(intPos2);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int2 = " + readBuffer.getInt());

            readBuffer.flip();
            channel.position(intPos1);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.printf("int1 = " + readBuffer.getInt());

            byte outputString[] = "Hello, world!".getBytes();
            long strPos1 = 0;
            long newIntPos1 = outputString.length;
            long newIntPos2 = newIntPos1 + Integer.BYTES;
            byte outputString2[] = "Nice to meet you".getBytes();
            long strPos2 = newIntPos2 + Integer.BYTES;
            long newIntPos3 = strPos2 + outputString2.length;

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            binChannel.position(newIntPos1);
            binChannel.write(intBuffer);
            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            binChannel.position(newIntPos2);
            binChannel.write(intBuffer);

            intBuffer.flip();
            intBuffer.putInt(1000);
            intBuffer.flip();
            binChannel.position(intPos3);
            binChannel.write(intBuffer);

            binChannel.position(strPos1);
            binChannel.write(ByteBuffer.wrap(outputString));
            binChannel.position(strPos2);
            binChannel.write(ByteBuffer.wrap(outputString2));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
