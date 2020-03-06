/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSerialization;

import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zia
 */
public class TestSerial {

    public static void main(String[] args) {
        try {
            Employee emp = new Employee();
            emp.empno = 12;
            emp.empName = "Employee Name";
            emp.empFatherName = "Employee Father Name";

            File myFile = new File("D:/empData.txt");

            if (myFile.exists()) {
                boolean isCreated = myFile.createNewFile();
                System.out.println("File Created");
            }

            try (FileOutputStream fos = new FileOutputStream(myFile);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(emp);

            } catch (NotSerializableException nse) {
                System.out.println("Serialization error");
            }

        } catch (IOException ex) {
            Logger.getLogger(TestSerial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
