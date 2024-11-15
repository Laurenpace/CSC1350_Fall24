package CSC1350_Fall24.TwoDArray;

public class VariableRowLength {
    public static void main(String[] args) {
        double[][] b = new double[3][];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = new double[i + 1]; //new array
//        }
        b[0] = new double[3];
//        for (int i = 0; i < ; i++) {
//
//        }
        

        for (int i = 0; i < b.length; i++) { //rows
            for (int j = 0; j < b[i].length; j++) { //columns
                System.out.printf("%-5.2f", b[i][j]); //print
            }
            System.out.println();
        }


    }
}
