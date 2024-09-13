package CSC1350_Fall24.Strings;

public class CharAtExample {
    public static void main(String[] args) {
        String word = "Sloth";
        //save first character in variable word
        char firstChar = word.charAt(0);
        //save last character in variable word
        char lastChar = word.charAt(4);
        System.out.println(firstChar);
        System.out.println(lastChar);
        //save last character in variable word using .length
        lastChar = word.charAt(word.length() - 1); //same functionality as line 7
        //print size/length of word
        System.out.println(word.length());
        System.out.println(lastChar);

        System.out.println(word.charAt(word.length())); //error

    }
}
