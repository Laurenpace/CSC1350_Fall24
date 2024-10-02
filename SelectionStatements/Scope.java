package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        String output = "";
        if (num > 10){
            output = "You entered a number greater than 10.";
            System.out.println("You entered a number greater than 10.");
            output += "more string";
            System.out.println(output);
        }
        System.out.println(output);


    }
}
