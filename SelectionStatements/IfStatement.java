package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        if (num > 10) {
            System.out.println("You entered a number greater than 10.");
            num++;
        } else if (num < 10) {
            System.out.println("You entered a number less than 10.");
        } else {
            System.out.println("You entered 10");
        }


//
//        ///////////
        System.out.print("Enter a 5: ");
        if (in.nextInt() == 5)
            System.out.println("Good job, you entered a 5");
        else System.out.println("Try again");
//
//

//        /////

        // Valid: Can have one line in body of if/else
        // statement with no braces



    }

}
