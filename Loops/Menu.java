package CSC1350_Fall24.Loops;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        String name = "";
        String menu = "Welcome to this menu driven program\n" +
                "Enter the corresponding number to select an option\n" +
                "1. Enter name\n" +
                "2. Print name\n" +
                "3. Print menu options\n" +
                "4. Exit";
        System.out.println(menu);


        while(flag){
            System.out.print("Enter a menu option: ");
            switch (in.nextInt()){
                case 1:
                    in.nextLine(); //clear new line after integer
                    if(name.isEmpty()) {
                        System.out.print("Enter your name: ");
                        name = in.nextLine();
                    }
                    else {
                        System.out.println("You've already entered a name! Are you sure want to overwrite the previous entry?");
                        System.out.println("Type yes or no to continue");
                        if(in.nextLine().equalsIgnoreCase("yes")){
                            System.out.print("Enter your name: ");
                            name = in.nextLine();
//                            in.nextLine();
                        }
                    }
                    break;

                case 2:
                    if(name.isEmpty()) {
                        System.out.println("You haven't entered your name yet");
                    }
                    else{
                        System.out.println("Hello, " + name + "!");
                    }
                    break;
                case 3:
                    System.out.println(menu);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Not an option, try again.");

            }
        }
    }
}
