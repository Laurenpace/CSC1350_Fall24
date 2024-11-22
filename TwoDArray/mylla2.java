//https://open.kattis.com/problems/mylla2
package CSC1350_Fall24.TwoDArray;

import java.util.Scanner;

public class mylla2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

/*
[0][0] [0][1]       [0][2]
*          *       *
*..

 */






    }
}


/*

        String[][] a = new String[3][3];
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextLine().split("");
        }

        boolean flag = false;
        for (int i = 0; i < 3; i++) {

            if (a[i][0].equals("O") && a[i][1].equals("O") && a[i][2].equals("O")) { //rows
                System.out.println("Jebb");
                flag = true;
            }
            if (a[0][i].equals("O") && a[1][i].equals("O") && a[2][i].equals("O")) { //columns
                System.out.println("Jebb");
                flag = true;

            }
        }
        if (a[0][0].equals("O") && a[1][1].equals("O") && a[2][2].equals("O")) { //diagonal
            System.out.println("Jebb");
            flag = true;

        }
        else if (a[0][2].equals("O") && a[1][1].equals("O") && a[2][0].equals("O")) {//diagonal
            System.out.println("Jebb");
            flag = true;

        }
        if(!flag) System.out.println("Neibb");





 */