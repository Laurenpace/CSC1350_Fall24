package CSC1350_Fall24.Strings;

import java.util.Scanner;

public class LengthExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "some text";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        String myString = "A sentence maybe.";
        System.out.println(myString.length());

        System.out.print("Enter a string: ");
        String input = in.nextLine();
        System.out.println(input.length());
    }
}
