package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class InputValidationUntilNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt()){
            in.nextLine();
            System.out.print("Enter an integer: ");
        }
        int n = in.nextInt();
        System.out.println("You entered an integer, " + n);
    }
}
