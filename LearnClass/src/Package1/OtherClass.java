/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/**
 *
 * @author zia
 */
public class OtherClass {

    private void method() {
        ParentClass obj = new ParentClass();
        System.out.println(obj.i); //accessable default
//        System.out.println(obj.j); //not accessable private
        System.out.println(obj.k); // accessable protected
    }
}
