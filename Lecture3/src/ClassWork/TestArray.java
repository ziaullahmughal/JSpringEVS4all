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
public class TestArray {
    public static void main(String[] args) {
        // define Array
        
        // First Method
        int[] arr; // Declaration
        arr = new int[10]; //Initialize
        arr[0] = 5; //Assignment
        
        // Second Method
        int[] arr2 = new int[10];
        arr2[0] = 5;
        
        // Thirsd Method
        int[] arr3 = {1,2,3,4,5,6,7,8,9,0};
        
        //following is wrong when assign again with less values
                //arr3 = {1,2,3,4,5,6};
        //it should be as new array
        
        //arr3 = new int[]{1,2,3,4,5,6};
    }
}
