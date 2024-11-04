package CSC1350_Fall24.Arrays;

import java.util.Scanner;


/*
//size of array
5
1
2
3
4
5
 */
public class SumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size ; i++) {
             sum = sum + arr[i];
        }

        for (int i = 0; i < size; i++) {
            sum *= arr[i];
        }

        System.out.println(sum);









//        System.out.print("Enter size of array: ");
//        int[] nums = new int[in.nextInt()];
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print("Enter an int: ");
//            nums[i] = in.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//        }
//        System.out.println("Sum is " + sum);
    }
}
