package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word that starts with 'he': ");
        String myString = in.next();
        if (myString.startsWith("he")){
            System.out.println("Correct!");
        }
        else System.out.println("Incorrect...");
    }
}
