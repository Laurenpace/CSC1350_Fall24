package CSC1350_Fall24.OOP.twitter;

import CSC1350_Fall24.OOP.Pets.Dog;

import java.util.Scanner;

/*
3
potato George george@potato.com 9999
orange Bob bob@bob.com 1111
apple Bob apple@asdf.com 4456
orange bob@orange.com
 */
public class TwitterDriver {
    public static void main(String[] args) {
        //    public Twitter(String userName, String name, String email, int phoneNumber) {
        Twitter user1 = new Twitter("userName", "name", "email", 2251234);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Twitter[] users = new Twitter[n];
//        Dog[] dogs = new Dog[5];
//        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {

            //potato George george@potato.com 9999
            String userName = in.next();
            String name = in.next();
            String email = in.next();
            int phone = in.nextInt();
            in.nextLine();
            Twitter user = new Twitter(userName, name, email, phone);
//            Twitter user = new Twitter(in.next(), in.next(), in.next(), in.nextInt());
            users[i] = user;
        }

        print(users);
        String userName = in.next();
        String email1 = in.next();
        for (int i = 0; i < users.length; i++) {
            if(userName.equals(users[i].getUserName())){
                users[i].setEmail(email1);
            }
        }



        System.out.println("");
        print(users);


    }
    public static void print(Twitter[] users){
        for (int i = 0; i < users.length; i++) {
            //System.out.println(users[i].getUserName() + " " + users[i].getName());
            users[i].print();
        }
    }
}
