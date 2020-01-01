/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author zia
 */
public class ManipulateNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        out.print("Enter First Number: ");
        int Num1 = scan.nextInt();
        out.print("Enter Second Number: ");
        int Num2 = scan.nextInt();
        out.print("Enter Third Number: ");
        int Num3 = scan.nextInt();

        // Checking Prime Number
        out.println("\n Finding Prime Number");
        is_prime(Num1);
        is_prime(Num2);
        is_prime(Num3);

        // Getting LDC
        out.println("\n Finding LCD (Least Common Divisor)");
        int lcd = 0;
        if (Num1 == 0 || Num2 == 0 || Num3 == 0) {
            out.println("Zero find in input values, LCD can not find !");

        } else if (Num1 == 1 || Num2 == 1 || Num3 == 1) {
            out.println("One (1) find in input values, LCD can not find !");

        } else {
            //lcd = get_lcd(Num1, Num2, Num3);
            lcd = getLCD(Num1, Num2, Num3);
        }

        if (lcd == 0) {
            out.println("LCD not found !");
        } else {
            out.println("LCD = " + lcd);
        }

        // Sorting Numbers
        int Sort1, Sort2, Sort3;

        if (Num1 <= Num2) {
            Sort1 = Num1;
            Sort2 = Num2;

        } else {
            Sort1 = Num2;
            Sort2 = Num1;
        }
        if (Num3 <= Sort1) {
            Sort3 = Sort2;
            Sort2 = Sort1;
            Sort1 = Num3;

        } else if (Num3 > Sort1 && Num3 <= Sort2) {
            Sort3 = Sort2;
            Sort2 = Num3;
        } else {
            Sort3 = Num3;
        }

        out.println("\n Sorting in Ascending Order :  ");
        out.println(Sort1 + ", " + Sort2 + ", " + Sort3);

        out.println("\n Sorting in Descending Order :  ");
        out.println(Sort3 + ", " + Sort2 + ", " + Sort1);

    }

    public static void is_prime(int Input) {
        if (Input == 0 || Input == 1) {
            out.println(Input + " is NOT Prime. A Prime Number must be greater than 1.");
        } else if (Input == 2 || Input == 3 || Input == 5 || Input == 7 || Input == 11) {
            out.println(Input + " is a Prime Number");
        } else if ((Input % 2) == 0) {
            out.println(Input + " is not a Prime Number, It's divisable by 2");
        } else if ((Input % 3) == 0) {
            out.println(Input + " is not a Prime Number, It's divisable by 3");
        } else if ((Input % 5) == 0) {
            out.println(Input + " is not a Prime Number, It's divisable by 5");
        } else if ((Input % 7) == 0) {
            out.println(Input + " is not 13a Prime Number, It's divisable by 7");
        } else if ((Input % 11) == 0) {
            out.println(Input + " is not a Prime Number, It's divisable by 11");
        } else {
            out.println(Input + " is a Prime Number");
        }

    }

    /*public static int get_lcd(int input1, int input2, int input3) {
        int divisor = 2, lcd = 0;

        while (divisor <= input1) {
            if (input1 % divisor == 0) {
                if ((divisor <= input2) && ((input2 % divisor) == 0)) {
                    if (divisor <= input3 && (input3 % divisor) == 0) {
                        lcd = divisor;
                        break;
                    } else {
                        divisor++;
                    }
                } else {
                    divisor++;
                }
            } else {
                divisor++;
            }
        }

        return lcd;
    }
*/
    private static int getLCD(int input1, int input2, int input3) {
        int returnval = 0, maxval;
        if (input1 >= input2) {
            maxval = input1;
        } else {
            maxval = input2;
        }
        if (input3 >= maxval) {
            maxval = input3;
        }
        maxval++;
        while (maxval != returnval) {
            if ((maxval % input1) == 0 && (maxval % input2) == 0 && (maxval % input3) == 0) {
                returnval = maxval;
            } else {
                maxval++;
            }
        }
        return returnval;
        
    }
}
