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
public class Task1 {

    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 0;
                } else {
                    board[i][j] = 1;
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("---------------------------------");
        
        int[][] board2 = new int[8][8];
        for (int i = 0; i < board2.length; i++) {
            for (int j = 0; j < board2[i].length; j++) {
                board[i][j] = ((i + j) % 2 == 0)? 0: 1;                
                System.out.print(board2[i][j] + " ");
            }
            //ptint here
            System.out.println("");
        }
        
        System.out.println("---------------------------------");
    }
}
