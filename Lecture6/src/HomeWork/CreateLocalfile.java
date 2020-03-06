/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateLocalfile {

    public static void main(String[] args) {
        File myfile = new File("D:/rao.txt");
        try {
            boolean isCreated = myfile.createNewFile();
            System.out.println("file created" + isCreated);
        } catch (IOException ex) {
            Logger.getLogger(CreateLocalfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
