/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileData;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

/**
 *
 * @author zia
 */
public class CopyFiledata {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream readFile = new FileInputStream("D:/FromFile.txt");
            ReadableByteChannel source = readFile.getChannel();

            FileOutputStream writeFile = new FileOutputStream("D:/ToFile.txt");
            WritableByteChannel Destination = writeFile.getChannel();

            copyData(source, Destination);
            System.out.println("Data Copied Successfully");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File Not found !");
        }
    }

    public static void copyData(ReadableByteChannel source, WritableByteChannel destination) {
        try {
            ByteBuffer buff = ByteBuffer.allocateDirect(1024);
            while (source.read(buff) != -1) {
                buff.flip();
                System.out.println(source.read(buff));
                while (buff.hasRemaining()) {
                    destination.write(buff);
                }
                buff.clear();
            }

        } catch (IOException iOExc) {
            System.err.println("Error !" + iOExc.getMessage());
        }
    }

}
