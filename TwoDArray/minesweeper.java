//https://open.kattis.com/problems/minesweeper
package CSC1350_Fall24.TwoDArray;

import java.util.Scanner;

public class minesweeper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int lines = in.nextInt();


        

        char[][] board = new char[row][column];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '.';
            }
        }
        for (int i = 0; i < lines; i++) {
            board[in.nextInt() - 1][in.nextInt() - 1] = '*';
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }



    }
}

/*
int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < k; i++) {
            board[in.nextInt()-1][in.nextInt()-1] = '*';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] != '*')
                    System.out.print('.');
                else System.out.print('*');
            }
            System.out.println();
        }
 */