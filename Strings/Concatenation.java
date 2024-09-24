package CSC1350_Fall24.Strings;

public class Concatenation {
    public static void main(String[] args) {
        String first = "bob";
        String second = "cat";
        String newString = first + second;

        System.out.println(newString);

        String anotherString = "bob" + second;
        System.out.println(anotherString);

        int num = 5;

        //concatenate string to integer
        System.out.println("num = " + num);

        String someString1 = "hi";
        String someString2 = "string";
        String stringConcat = someString1 + someString2;


        System.out.println("result of concatenating and then printing " + stringConcat);

        System.out.println("someString1 is unchanged: " + someString1);
        System.out.println("someString2 is unchanged: " + someString2);

        System.out.println("concat in print statement " + someString1 + someString2);

        System.out.println("formatting strings cleanly with spacing: " + someString1 + " " + someString2);


    }
}
