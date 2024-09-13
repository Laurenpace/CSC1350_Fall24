package CSC1350_Fall24.Strings;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line of strings: ");
        String s = in.nextLine();

        System.out.println("You entered: " + s);

        System.out.print("Enter one string: ");
        String str = in.next();

        System.out.println("You entered: " + str);

    }
}
