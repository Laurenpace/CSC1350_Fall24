package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String s = "";
        if(num == 5){
            s = "five";
        }
        else {
            s = "not five";
        }

        System.out.println(s);

        //declaration
        String s1 = (num == 5) ? "five" : "not five";
        System.out.println(s1);


        //just printing
        System.out.println((num == 5) ? "five" : "not five");
    }
}
