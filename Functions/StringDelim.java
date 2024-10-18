package CSC1350_Spring24.Arrays;

public class StringDelim {
    public static void main(String[] args) {
        String[] splitArrayBySpace = "Split this string".split(" ");
        printStringArray(splitArrayBySpace);

        String[] multipleDelim = "This,string-is.messy".split("[,-.]");
        printStringArray(multipleDelim);

        String[] splitting = "thisandaaasomething".split("a+");
        printStringArray(splitting);

        String[] splitByNumber = "word2split56by234numbers".split("\\d+");
        printStringArray(splitByNumber);
    }

    public static void printStringArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
