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
public class TestVarArg {
    public static void main(String[] args) {
        print(10);
        print(10, 11.1, "two");
        print('a', 'c');
        print();
    }
    
    public static void print (Object...arg){
        for (Object o : arg){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
