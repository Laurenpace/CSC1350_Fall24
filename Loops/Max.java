package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double largest = in.nextDouble();
        while (in.hasNextDouble()){
            double input = in.nextDouble();
            if (input > largest){
                largest = input;
            }
        }
        System.out.println(largest);

    }
}
