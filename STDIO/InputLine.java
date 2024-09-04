package CSC1350_Fall24.STDIO;

import java.util.Scanner;
public class InputLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line: ");
        System.out.println(in.nextLine());
    }
}
