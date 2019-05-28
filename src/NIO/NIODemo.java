package NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIODemo {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("./src/NIO/demo.txt", "rw");

            ByteBuffer byteBuffer = ByteBuffer.allocate(1042);

            FileChannel fileChannel = randomAccessFile.getChannel();

            while (fileChannel.read(byteBuffer) > 0) {
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    System.out.print((char) byteBuffer.get());
                }
                byteBuffer.compact();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
