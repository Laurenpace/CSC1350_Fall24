package CSC1350_Fall24.Strings;

import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "sometext";

        String hi = "sometext".substring(4, 8); //.substring(inclusive, exclusive)

        String inputString = in.nextLine();
        String split = inputString.substring(0, 2);

        String hi2 = in.nextLine().substring(4, 8); //.substring(inclusive, exclusive)

        System.out.println(str);
        System.out.println(hi2);
    }
}