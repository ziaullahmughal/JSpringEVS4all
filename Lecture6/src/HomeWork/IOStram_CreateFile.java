/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.io.File;
import java.io.IOException;

public class IOStram_CreateFile {

    public static void main(String[] args) throws IOException {
        // create File at location
        try {
            File myFile = new File("d:/abc.txt");
            boolean isCreated;
            isCreated = myFile.createNewFile();
            System.out.println("File Created : " + isCreated);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
