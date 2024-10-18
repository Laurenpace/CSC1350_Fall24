package CSC1350_Fall24.Arrays;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int[] nums = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter an int: ");
            nums[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("Sum is " + sum);
    }
}
