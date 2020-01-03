/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

/**
 *
 * @author zia
 */
public class ManipulateNum {
    public static void main(String[] args) {
        ManipulateNumJFrame MNJFrame = new ManipulateNumJFrame();
        MNJFrame.setVisible(true);
    }

    public static int getLCD(int input1, int input2, int input3) {
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

    public static boolean is_prime(int Input) {
        boolean v_return;
        if (Input == 2 || Input == 3 || Input == 5 || Input == 7 || Input == 11) {
            v_return = true;
        } else if ((Input % 2) == 0 || (Input % 3) == 0 || (Input % 5) == 0 || (Input % 7) == 0 || (Input % 11) == 0) {
            v_return = false;
        } else {
            v_return = true;
        }
        return v_return;

    }

    public static String doSort(int Num1, int Num2, int Num3, char SortOrder) {
        int Sort1, Sort2, Sort3;
        String Sorted = null;

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

        if (SortOrder == 'A') {
            Sorted = (Sort1 + ", " + Sort2 + ", " + Sort3);
        } else if (SortOrder == 'D') {
            Sorted = (Sort3 + ", " + Sort2 + ", " + Sort1);
        }

        return Sorted;
    }

}
