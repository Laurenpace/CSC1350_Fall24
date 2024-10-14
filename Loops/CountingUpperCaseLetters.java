package CSC1350_Fall24.Loops;

public class CountingUpperCaseLetters {
    public static void main(String[] args) {
        int upperCaseLetters = 0;
        String str = "Hello, world. Welcome to Java.";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCaseLetters++;
            }
        }
        System.out.printf("\"%s\" has %d uppercase characters\n", str, upperCaseLetters);

    }
}
