/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author zia
 */
public class TestFile {

    public static void main(String[] args) throws IOException {

        File f = new File("c:\testfile.txt");

        //list all files
        File[] drives = File.listRoots();
        for (File drive : drives) {

            for (File d : drive.listFiles()) {
                System.out.println((d.isFile() ? "=File=" : "=Drive=") + d);
            }

        }
    }
}
