/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

/**
 *
 * @author zia
 */
public class TestArrayName {

    public static void main(String[] args) {
        char[] myname = {'Z', 'i', 'a'};
        String myname2 = "Ziaullah"; // immutable or fixed

        System.out.println(myname);
        System.out.println(myname2);

        String myname3 = new String("Ziaullah");

        if (myname2 == myname3) /* Comparing Reference */ {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (myname2.equals(myname3)) /* Comparing Values */ {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
