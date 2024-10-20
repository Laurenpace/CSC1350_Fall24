package CSC1350_Fall24.Loops;

import java.util.Scanner;
//input
/*
4
this
is
a
test that won't print without .nextLine() after .nextInt (or anything that won't consume the new line)

 */

public class ClearNewLineCharacterAfterNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        in.nextLine(); //add this if using nextLine after something like nextInt

        for (int i = 0; i < n; i++) {
            System.out.println(in.nextLine());
        }
    }
}
