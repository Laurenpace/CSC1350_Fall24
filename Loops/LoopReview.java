package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class LoopReview {
    public static void main(String[] args) {
//        for (int i = 10; i > 2 ; i = i - 3) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 10; i >= 0 ; i = i - 3) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 5; i <= 25; i = i + 5) {
//            System.out.print(i + " ");
//        }


        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("enter \"bye\" to end the program");
            String s = in.nextLine();
            if(s.equals("bye")){
                flag = false;
            }
            else System.out.println("You entered " + s);
        }
        System.out.println("Bye!");
    }
}
