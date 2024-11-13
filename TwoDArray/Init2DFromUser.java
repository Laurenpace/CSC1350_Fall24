package CSC1350_Fall24.TwoDArray;

import java.util.Scanner;
public class Init2DFromUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = 2;
        int column = 3;
        int[][] td = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                td[i][j] = in.nextInt();
            }

        }

        for (int i = 0; i < td.length; i++) {
            for (int j = 0; j < td[i].length; j++) {
                System.out.print(td[i][j] + " ");
            }
            System.out.println();

        }
    }
}