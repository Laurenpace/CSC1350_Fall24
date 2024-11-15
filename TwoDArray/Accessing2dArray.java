package CSC1350_Fall24.TwoDArray;

public class Accessing2dArray {
    public static void main(String[] args) {
        int[] one = {1, 2, 3};
        int[][] my2dMatrix = {{1,3,4,5},{11,15,2,3},{2,14,1,1},
                            {3,12,32,5},
                            {4,5,21,87}};



        System.out.println(my2dMatrix[2][3]);
        System.out.println(my2dMatrix[3][2]);  

        for (int i = 0; i < my2dMatrix.length; i++) { //rows
            for (int j = 0; j < my2dMatrix[i].length; j++) { //columns
                System.out.printf("%-3d", my2dMatrix[i][j]); //print
            }
            System.out.println();
        }


    }
}
