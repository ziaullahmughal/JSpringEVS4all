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
        
        TestPoint(){
            // Default Constructor
            this(0, 0); // self call using 'this'
        }
        
        TestPoint(double newX, double newY){
            //argument constructor
            setX(newX); // x = newX;
        }
        
        TestPoint (TestPoint p){ //coping / clone constructor
            //setX(p.x);
            this(p.x, p.y);
        }
        
        public static void main(String[] args) {
        
        TestPoint p = new TestPoint(); // object declaration
        TestPoint p1 = new TestPoint(); // an other object with different memory
        p.x = 12; // use object attributes
        p.y = 14;
        
        p1.setX(13); //batter approach to encapsolate coding and hide working, called single responsibility principle
        
        TestPoint pp1 = new TestPoint(10, 20);
        pp1.x = 12;
        TestPoint pp2 = new TestPoint(pp1);
        pp1.x = 15;
        
        System.out.println(pp1.x);
        System.out.println(pp2.x);
        
    }
}
