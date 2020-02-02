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
public class ChildClass extends ParentClass{
    public int a = 100;
    private void method(){
        System.out.println(i); // accessable default
//        System.out.println(j); //not accessable private
        System.out.println(k); // accessable protected
    }
}
