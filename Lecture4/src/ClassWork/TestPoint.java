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
public class TestPoint {
    // attributes
        double x;
        double y;
    
        void setX (double newX) {
            x = newX;
        }
        
        double getX(){
            return x;
        }
        
        public static void main(String[] args) {
        
        TestPoint p = new TestPoint(); // object declaration
        TestPoint p1 = new TestPoint(); // an other object with different memory
        p.x = 12; // use object attributes
        p.y = 14;
        
        p1.setX(13); //batter approach to encapsolate coding and hide working, called single responsibility principle
        
    }
}
