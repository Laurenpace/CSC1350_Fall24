package CSC1350_Fall24.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = 2;
        int column = 3;
        int[][] td = new int[row][column];
        //populate through user input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                td[i][j] = in.nextInt();
            }

        }

        //initialize 2d array
        int[][] matrix = {
                {4, 3, 2},
                {1, 1, 1},
                {40, 4, 4},
                {5, 5, 5}
        };
        print2dArray(matrix);
        System.out.println(matrix.length); //row
        System.out.println(matrix[0].length); //column

        System.out.println("Sum: " + sum2dArray(matrix));

        int[] oneDArray = {1, 3, 5};
        System.out.println(Arrays.toString(oneDArray));
        System.out.println(Arrays.toString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        //variable row length array
        double[][] variableRowArr = new double[3][];
        for (int i = 0; i < variableRowArr.length; i++) {
            variableRowArr[i] = new double[i + 1];
        }


        for (int i = 0; i < variableRowArr.length; i++) {
            for (int j = 0; j < variableRowArr[i].length; j++) {
                variableRowArr[i][j] = in.nextInt();
            }
        }
        print2dArray(variableRowArr);
    }


    public static void print2dArray(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) { //rows
            for (int j = 0; j < intArray[i].length; j++) { //
                System.out.printf("%-3d", intArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void print2dArray(double[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) { //rows
            for (int j = 0; j < doubleArray[i].length; j++) { //
                System.out.printf("%-5.2f", doubleArray[i][j]);
            }
            System.out.println();
        }
    }



    public static int sum2dArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
