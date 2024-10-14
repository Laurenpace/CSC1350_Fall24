package CSC1350_Fall24.Loops;

public class FindPositionOfFirstLowerCaseLetter {
    public static void main(String[] args) {
        boolean found = false;
        char ch;
        String str = "Hello";
        int position = 0;
        while (!found && position < str.length()){
            ch = str.charAt(position);
            if (Character.isLowerCase(ch)) {
                found = true;
            }
            else {
                position++;
            }
        }

        if (found) {
            System.out.println("First lower case letter found at position " + position);
        }
        else {
            System.out.println("No lower case letter found");
        }

    }
}
