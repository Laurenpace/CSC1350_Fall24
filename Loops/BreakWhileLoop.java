package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class BreakWhileLoop {
    public static void main(String[] args) {
        double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (enter a negative number to exit): ");
            number = input.nextDouble();
            // if number is negative the loop terminates
            if (number < 0.0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum = " + sum);

        ////without break
//        number = 0.0;
//        sum = 0.0;
//        System.out.print("Enter a number (negative number to exit): ");
//        number = input.nextDouble();
//        while (number >= 0.0) {
//            sum += number;
//            System.out.print("Enter a number (negative number to exit): ");
//            number = input.nextDouble();
//        }
//        System.out.println("Sum = " + sum);
    }
}
