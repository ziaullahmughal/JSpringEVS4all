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
public class IOStreamOptions {

    public static void main(String[] args) throws IOException {
        try (InputStream keyboard = new BufferedInputStream(System.in)) {
            byte[] b = new byte[1024];
            System.out.print(">>");
            int readByte = keyboard.read(b);
            String s;
            s = new String(b, 0, readByte);
        
            System.out.println(">" + s);

        } catch (Exception e) {
        }
        
    }
    
}
