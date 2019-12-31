/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

import static java.lang.System.out;

/**
 *
 * @author zia
 */
public class TestLetters {
    
    

    public static void main(String[] args) {
        char a;
        a = 3;

        out.println("If Condition");
        if (a == 0) {
            out.println("Value is Zero");
        } else if (a == 1) {
            out.println("Value is One");
        } else if (a == 2) {
            out.println("Value is Teo");
        } else if (a == 3) {
            out.println("Value is Three");
        } else if (a == 4) {
            out.println("Value is Four");
        } else {
            System.out.println("Others");
        }
        
        out.println("Using Swith ");

        switch (a) {
            case 0:
                out.println("Value is Zero");
                break;
            case 1:
            case 99:
                out.println("Value is One");
                break;
            case 2:
                out.println("Value is Teo");
                break;
            case 3:
                out.println("Value is Three");
                break;
            case 4:
                out.println("Value is Four");
                break;
            default:
                System.out.println("Others");
                break;
        }
        // ternary opperator
        //expression ?  true : false
        out.println("Ternary Operator");
        out.println(a == 0 ? "Zero" : "Others");
        
        out.println("Ternary Operator with nasted");
        out.println(a == 0 ? "Zero" : a == 1 ? "One" : a == 3 ? "Three" : "Unknown");
        
        ShirtSizes size = ShirtSizes.xlarge;
        out.println(size);


    }
}
