package CSC1350_Fall24.Loops;
/*
input: first line n, the number of integers to sum
9
3
2
4
5
6
7
8
9
10
11
14


//notice extra values you do not want to sum
 */
import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0; //declare out here so we can print it after loop
//        int i = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }
        System.out.println("Sum = " + sum);
    }
}
