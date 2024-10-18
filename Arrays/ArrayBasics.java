package CSC1350_Fall24.Arrays;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arrayOfDoubles = {4.0, 3.2, 4.5};

        String[] arrString = {"a string", "another"};


        int[] arrayName = new int[5000];

//        int arrLength = in.nextInt();
//        int[] difArr = new int[arrLength];


//        System.out.print("enter size for array: ");
//        int[] arr = new int[in.nextInt()];
//        System.out.println(arr.length);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] * 2);
//        }
//
//        int n1 = arr[0] / 5;

        String[] s = {"banana", "apple", "ana"};
        int indexOfBanana = 100;

        for (int i = 0; i < s.length; i++) {
            if(s[i].equals("ana")){
                System.out.println(i);
                indexOfBanana = 0;
            }
        }

        int index = findString(s, "asdf");
        if(index == -1) System.out.println("never found");


    }

    public static int findString(String[] s, String looking){
        int index = -1;
        for (int i = 0; i < s.length; i++) {
            if(s[i].equals(looking)){
                index = i;
            }
        }
        return index;
    }
}
