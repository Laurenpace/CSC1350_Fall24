package CSC1350_Fall24.Arrays;

import java.util.Scanner;

public class InitializeAnArrayFromUserAndPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt user to input array size
        System.out.print("What size would you like your array: ");
        int arraySize = in.nextInt();
        int[] myArray = new int[arraySize];

        System.out.println("enter elements");
        //iterate through length of array
        //don't have to do .length - 1 because of the less than in the for loop
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }

        myArray[5] = 10;
        System.out.println("Printing array");

        //print myArray
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println(myArray);

    }
}
