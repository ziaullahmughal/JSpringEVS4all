/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author zia
 */
public class WallBrickCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double WallLength, WallHeight;
        int WallWidthBricks, WallLinesCount, WallLineBricksCount;
        Scanner Scan = new Scanner(System.in);
        out.print("Enter Wall Length (Feet): ");
        WallLength = Scan.nextDouble();
        out.print("Enter Wall Height (Feet): ");
        WallHeight = Scan.nextDouble();
        out.print("Enter No. of Bricks for Wall Width (1/2): ");
        WallWidthBricks = Scan.nextInt();

        BrickLine NewLine = new BrickLine(WallLength * 12, WallWidthBricks);

        WallLinesCount = (int) ((WallHeight * 12) / NewLine.BrickLineHeight);
        WallLineBricksCount = (int) Math.ceil(NewLine.BricksPerLine);
        out.println("------------------------------------");
        out.println("Brick Size (W x L x H): " + NewLine.BrickDimension);
        out.println("Number of Brick Lines are: " + WallLinesCount);
        out.println("Bricks Per Line are: " + WallLineBricksCount + " (" + NewLine.BricksPerLine + ")");
        out.println("Total Number of Bricks: " + WallLineBricksCount * WallLinesCount);

    }

}
