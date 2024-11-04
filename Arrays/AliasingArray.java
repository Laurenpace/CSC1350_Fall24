package CSC1350_Fall24.Arrays;

import java.util.Scanner;
public class AliasingArray {
    public static void main(String[] args) {
        int[] list1 = {2, 3, 6, 8};
        int[] list2 = list1;

        System.out.print("List1 ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }

        System.out.println();
        System.out.print("List2 ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i]+ " ");
        }
        System.out.println();

        list1[2] = 0;
        System.out.print("List1 ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i]+ " ");
        }
        System.out.println();

        System.out.print("List2 ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i]+ " ");
        }
        System.out.println();

        list2[0] = 0;
        System.out.print("List1 ");

        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i]+ " ");
        }
        System.out.println();

        System.out.print("List2 ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i]+ " ");
        }
    }
}

