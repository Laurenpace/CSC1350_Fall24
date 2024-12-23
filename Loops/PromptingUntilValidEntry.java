package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class PromptingUntilValidEntry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valid = true;
        double input;

        System.out.print("Please enter a positive value < 100: ");
        input = in.nextDouble();

        while(input >= 100 || input <= 0){
            System.out.println("Invalid input.");
            System.out.print("Please enter a positive value < 100: ");
            input = in.nextDouble();
        }
        ///////////
        //another way of doing this
        while (valid){

            System.out.print("Please enter a positive value < 100: ");
            input = in.nextDouble();
            if (0 <= input && input < 100) {
                valid = false;
            }
            else {
                System.out.println("Invalid input.");
            }
        }


        //////////
      

    }
}
