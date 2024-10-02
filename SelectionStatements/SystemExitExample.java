package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class SystemExitExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Warning! If you enter a number over 10 this program will end!");
        int n1 = in.nextInt();
        if(n1 > 10){
            System.out.println("Why would you do this...");
            System.exit(0); //program ends
            System.out.println("This print statement is unreachable");
        }
        System.out.println("Phew, that was close");
    }
}
