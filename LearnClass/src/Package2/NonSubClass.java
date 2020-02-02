/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;
//import Package1.*;
/**
 *
 * @author zia
 */
public class NonSubClass {
    public  void method(){
        Package1.ParentClass obj = new Package1.ParentClass();
        
        System.out.println(obj.l);
        
        
    }
}
