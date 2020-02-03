/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;


public class Bricks {

    double BrickHeight, BrickWidth, BrickLength, PosX, PosY;

    Bricks() {
        BrickLength = 9.0;
        BrickHeight = 3.0;
        BrickWidth = 4.5;
    }

    Bricks(double NewPosX, double NewPosY) {
        this();
        PosX = NewPosX;
        PosY = NewPosY;
    }

    Bricks(Bricks Br) {
        this(0, 0);
    }
}
