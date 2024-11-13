package CSC1350_Fall24.TwoDArray;

import java.util.Arrays;

public class ArraysToStringBuiltIn {
    public static void main(String[] args) {
        String[] sArr = {"hi", "1d", "array"};
        System.out.println(Arrays.toString(sArr));

        String[][] TwoDStringArray = {sArr, {"another", "array", "of", "Strings"}};
        System.out.println(Arrays.toString(TwoDStringArray));
        for (int i = 0; i < TwoDStringArray.length; i++) {
            System.out.println(Arrays.toString(TwoDStringArray[i]));
        }


    }
}
