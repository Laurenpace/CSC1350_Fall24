package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5");
        int num = in.nextInt();
        switch (num){
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            case 4:
                System.out.println("You entered 4");
                break;
            case 5:
                System.out.println("You entered 5");
                break;
            default:
                System.out.println("You entered a number outside the range");
        }




    }
}
