package CSC1350_Fall24.Functions;

import java.util.Scanner;

public class ReturnEvenArray {
    public static void main(String[] args) {
        int[] mainArr = evenArr();
        for (int i = 0; i < mainArr.length; i++) {
            System.out.println(mainArr[i]);
        }
    }

    public static int[] evenArr(){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        return arr;

    }
}
