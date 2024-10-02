package CSC1350_Fall24.Variables;

import java.util.Scanner;

public class UsingVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        System.out.print("Your number is: ");
        System.out.println(number);
        System.out.print("Update your number: ");
        number = in.nextInt();
        System.out.print("Your number is: ");
        System.out.println(number);
    }
}
