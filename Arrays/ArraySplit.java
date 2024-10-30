package CSC1350_Fall24.Arrays;

public class ArraySplit {
    public static void main(String[] args) {
        String[] splitArray = "Split this string".split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            System.out.println(splitArray[i]);
        }

        String[] multipleDelim = "This,string-is.messy".split("[,-.]");
        for (int i = 0; i < multipleDelim.length; i++) {
            System.out.println(multipleDelim[i]);
        }

    }
}
