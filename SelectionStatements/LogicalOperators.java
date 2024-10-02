package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  num = in.nextInt();
        if((num < 10) && (num > 0) ){
            System.out.println("number between 0 and 10");
        }
        if ((num <= 0) || (num == 10) ){
            System.out.println("true");
        }
        if(!(num == 2)){
            System.out.println("num is not 2");
        }
    }
}
