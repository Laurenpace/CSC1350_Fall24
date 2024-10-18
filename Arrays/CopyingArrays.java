package CSC1350_Fall24.Arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[1] = 2;
        arr1[2] = 5;
        int[] copyOfArray = Arrays.copyOf(arr1, arr1.length);
        copyOfArray[0] = 4;

        int[] cloneArray = arr1.clone();
        cloneArray[0] = 3;
    }
}
