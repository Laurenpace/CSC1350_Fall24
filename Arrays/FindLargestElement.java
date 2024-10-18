package CSC1350_Fall24.Arrays;

import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int[] nums = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter an int: ");
            nums[i] = in.nextInt();
        }

        int largest = nums[0];
        for (int i = 1; i < nums.length; i++){

            if (nums[i] > largest){

                largest = nums[i];
            }
        }
        System.out.println("Largest element in array is: " + largest);
    }
}
