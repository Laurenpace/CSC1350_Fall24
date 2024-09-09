package CSC1350_Fall24.Variables;


import java.util.Scanner;

public class InputVariables {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int intVar = in.nextInt();
            double doubleVar = in.nextDouble();
            boolean booleanVar = in.nextBoolean();
            System.out.println(intVar);
            System.out.println(doubleVar);
            System.out.println(booleanVar);
        }
    }