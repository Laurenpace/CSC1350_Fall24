package CSC1350_Fall24.Arrays;

import java.util.Arrays;

public class ArrayAliasing {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(numbers);
        numbers[1] = 4;
        System.out.println(numbers[1]);
        int[] num = numbers; //num now references numbers
        System.out.println(num);
        num[1] = 5;
        System.out.println(numbers[1]);
        double[] values;
        values = new double[10];
        values[4] = 35;


        double[] a = {5, 10, 13, 5, 17, 2};
        //double size of a
        double[] newA = Arrays.copyOf(a, 2 * a.length);
        a = newA;
        newA[4] = 5;

        int[] arr ={5, 10, 13, 5, 17, 2};
        int[] another = arr;
//        int[] another = arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(another));

        another[0] = 400;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(another));
    }

}
