package CSC1350_Fall24.SelectionStatements;

public class NOT {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;

        if(!(num1 != num2)) {

        }
        else System.out.println("4 != 7 returns true but negating it with ! returns false");

        if(!(num1 > num2)) {
            System.out.println("4 > 7 is false but negating it results in true");
        }
    }
}
