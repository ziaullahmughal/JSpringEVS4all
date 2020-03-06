/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author zia
 */
public class IOStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input stream
        //int read(); // single
        //int read(byte[]); // array -- count
        //int read(byte[], int offset, int length); // offset

        //output stram
        // void write (byte); // single
        // void write (byte[]); // array
        // void write (byte[], int offset, int length); //offset write
        InputStream keyboard = new BufferedInputStream(System.in);
        
        try {
            byte[] b = new byte[1024];
            System.out.print(">>");
            int readByte = keyboard.read(b);
            String s;
            s = new String(b, 0, readByte);
                    
            
            System.out.println(">>" + s);

        } 
        catch (IOException ioe){
            
        }
        catch (Exception e) {

        } // in any case success or failure code will run in any case.
        finally {
            try {
                keyboard.close();
            } catch (IOException ioex) {
            }
        }

    }

}
