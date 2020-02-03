/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

/**
 *
 * @author zia
 */
public class BrickLine {
    
    double BrickLineHeight, BrickLineWidth, BrickLineLength, BrickLinePosX, BrickLinePosY;
    double BricksPerLine;
    String BrickDimension;
    
    
    BrickLine(){
        BrickLinePosX = 0.0;
        BrickLinePosY = 0.0;                
    }
    
    BrickLine(double WallLength, double WallWidthBricks){
        this();
        Bricks NewBrick = new Bricks(0, 0);
        BrickLineHeight = NewBrick.BrickHeight;
        BrickLineLength = WallLength;
        BrickLineWidth = NewBrick.BrickWidth * WallWidthBricks;
        BricksPerLine = (BrickLineLength / NewBrick.BrickLength) * WallWidthBricks;
        BrickDimension = "(Inch) " + NewBrick.BrickWidth + " x " + NewBrick.BrickLength + " x " + NewBrick.BrickHeight;
    }
}
