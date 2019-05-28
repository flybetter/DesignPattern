package NIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IODemo {
    public static void main(String[] args) {
        try {

            RandomAccessFile randomAccessFile = new RandomAccessFile("./src/NIO/demo.txt", "rw");

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            FileChannel fileChannel = randomAccessFile.getChannel();

            int bytesRead = fileChannel.read(byteBuffer);
            System.out.println((char)bytesRead);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }

            byteBuffer.compact();
            fileChannel.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
