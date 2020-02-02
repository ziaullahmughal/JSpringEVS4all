/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;
/**
 *
 * @author zia
 */
public class FirstClass extends Package1.ParentClass{
    public void method (){        
        
//        System.out.println(i); //not accessable default
//        System.out.println(j); //not accessable private
        System.out.println(k); // accessable protected
    }
    
    
}
