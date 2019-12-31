/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author zia
 */
public class TestLoop {
    public static void main(String[] args) {
        // initialization, condition, increment, statement

        // while loop
        int a = 1; // initialization
        Scanner scan = new Scanner(System.in);
        
        out.print("Enter Table : ");
        int table = scan.nextInt();
        while (a<=10) //condition
        {
            out.println(table + " x " + a + " = " + (table*a)); // statement
            a++; //increment
        }
        // do while loop
        out.println("Using Do While Loop");
        do {
            out.println(table + " x " + a + " = " + (table*a));
            a++;
        } while (a <=10);
        // for loop
        for (int b = 1; b<=10; b++){
            out.println(b);
        }
        // for each loop
    }
}
