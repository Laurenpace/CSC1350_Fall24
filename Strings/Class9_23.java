package CSC1350_Fall24.Strings;

import java.util.Scanner;

public class Class9_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//
//        System.out.println(str.toUpperCase());
//        System.out.println("asdfasdf adsf ads".toUpperCase());
//
//
//        String subStringResult = str.substring(0,3);
//        System.out.println(subStringResult);
//
//        String csv = "lauren,pace,computer science";
//        System.out.println(csv.replace(",", " "));

        /*Enter a string: i can put numbers, 12345, in my string input too
The length of the string is 48
Enter start index for substring: 10
Enter end index for substring: 25
The substring from 10 to 25 is: numbers, 12345,


Input
String
startInt
endInt



INPUT
i can put numbers, 12345, in my string input too
10
25



OUTPUT:
subtring is: numbers, 12345,
*/



//        System.out.printf("substring is: %s", in.nextLine().substring(in.nextInt(), in.nextInt()));

        //someString.theStringMethodName(arguments)
//        int startIndex = in.nextInt();
//        int endIndex = in.nextInt();
//        String substring = input.substring(startIndex,endIndex);

//        System.out.printf("substring is: %s", substring);




        String input = in.nextLine();
        System.out.println(input.length());
        int lengthResult = input.length();
        System.out.println(lengthResult);
        System.out.println("last char is " + input.charAt(lengthResult - 1) + " more text " + lengthResult + " asdfsdf.");
        char last = input.charAt(lengthResult - 1);
        System.out.printf("the length of the string, %s, is %d. The last character of the string is, %c ", input, lengthResult, last);
    }
}
