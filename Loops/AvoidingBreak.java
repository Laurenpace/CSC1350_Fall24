package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class AvoidingBreak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        for (int i = 0; i < 5 && flag; i++) {
            for (int j = 0; j < 3 && flag; j++) {
                if(in.nextInt() == -1){
                    flag = false;
                }
            }

            System.out.println(i);
        }
    }


}
