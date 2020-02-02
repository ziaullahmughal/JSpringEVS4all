/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;


import static java.lang.System.out;

/**
 *
 * @author zia
 */
public class TwoDimArray {
    public static void main(String[] args) {
        String[][] twodimar = new String[6][8];
        twodimar[0][0] = "a";
        twodimar[0][1] = "b";
        twodimar[5][5] = "T";
        
        for(int i = 1; i< twodimar.length; i++){
            for (int j=0; j<=7; j++){
                out.print(twodimar[i][j]);}
        out.println("");
    }
        
//        for (String[] ChessBlockPrintRow : twodimar) {
//            for (String ChessBlockPrintCol : ChessBlockPrintRow) {
//                out.print(ChessBlockPrintCol+" ");
//            }
//            out.println("");
//        }
        
    }
    
}
