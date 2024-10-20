package CSC1350_Fall24.Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= 15 ; j++) {
                System.out.printf("%-4d" , i*j );
            }
            System.out.println();
        }
    }
}
