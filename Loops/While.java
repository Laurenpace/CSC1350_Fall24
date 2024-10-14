package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while(num <= 10)
        {
            System.out.println(num);
            num++;
        }




        //matching passwords
        System.out.print("Enter your password: ");
        String pw1 = in.nextLine();

        System.out.print("Reenter your password: ");
                String pw2 = in.nextLine();

        while(!pw2.equals(pw1)){
            System.out.println("Passwords don’t match");

            System.out.print("Enter your password: ");
            pw1 = in.nextLine();

            System.out.print("Re-enter your password: ");
            pw2 = in.nextLine();

        }
        System.out.println("Passwords match");
    }
}
