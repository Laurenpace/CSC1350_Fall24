package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        int j = 0;
        while(j < s.length()){
            System.out.println(s.charAt(j));
            j++;
        }

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
    }
}
