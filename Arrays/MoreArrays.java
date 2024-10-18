package CSC1350_Fall24.Arrays;

import java.util.Scanner;

public class MoreArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int length = in.nextInt();
        int[] whatever = new int[in.nextInt()];
        for (int i = 0; i < whatever.length; i++) {
            System.out.println(whatever[i]);
        }
        whatever[3] = 1000000;
        System.out.println("//////////////");

        int[] another = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < whatever.length; i++) {
            whatever[i] = in.nextInt();
        }

        for (int i = 0; i < whatever.length; i++) {
            System.out.println(whatever[i]);
        }
    }
}
