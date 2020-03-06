/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.io.File;

public class IOStram_ListDriveFiles {

    public static void main(String[] args) {
        try {
            File[] myDrives = File.listRoots();
            for (File driveList : myDrives) {
                System.out.println((driveList.isDirectory() ? "Drive " : (driveList.isFile() ? "File " : "Other ")) + driveList);
                for (File fileList : driveList.listFiles()) {
                    System.out.println((fileList.isDirectory() ? "Drive " : (fileList.isFile() ? "File " : "Other ")) + fileList);
                }
            }
        } catch (NullPointerException npe) {
            System.out.println("Error " + npe);
        }
    }
}
