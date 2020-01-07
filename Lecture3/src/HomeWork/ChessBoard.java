/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import static java.lang.System.out;
import java.util.Arrays;

/**
 *
 * @author zia
 */
public class ChessBoard {

    public static void main(String[] args) {
        String[][] ChessBlock = new String[8][8];
        for (int i = 0; i < ChessBlock.length; i++) {
            
            if (i >= 2 && i <= 5) {
                Arrays.fill(ChessBlock[i], " " + (char) 1 + " ");
            } else if (i == 1 || i == 6) {
                Arrays.fill(ChessBlock[i], " " + ChessBoardPieces.P.toString() + " ");
            } else {
                for (int j = 0; j < ChessBlock[i].length; j++) {
                    switch (j) {
                        case 0:
                        case 7:
                            ChessBlock[i][j] = " " + ChessBoardPieces.R + " ";
                            break;
                        case 1:
                        case 6:
                            ChessBlock[i][j] = " " + ChessBoardPieces.N + " ";
                            break;
                        case 2:
                        case 5:
                            ChessBlock[i][j] = " " + ChessBoardPieces.B + " ";
                            break;
                        case 3:
                            ChessBlock[i][j] = " " + ChessBoardPieces.K + " ";
                            break;
                        case 4:
                            ChessBlock[i][j] = " " + ChessBoardPieces.Q + " ";
                            break;
                        default:
                            ChessBlock[i][j] = " " + (char) 1 + " ";
                            break;
                    }
                }
            }

        }

        for (String[] ChessBlockPrintRow : ChessBlock) {
            for (String ChessBlockPrintCol : ChessBlockPrintRow) {
                out.print(ChessBlockPrintCol);
            }
            out.println("");
        }
        
        out.println("---------------------------------------");
        out.println("K = King, Q = Queen, B = Bishop");
        out.println("N = Knight, R = Rook, P = Pawn");
        out.println("---------------------------------------");

    }
}
