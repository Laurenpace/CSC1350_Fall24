package CSC1350_Fall24.Functions;

public class Reference {
    public static void main(String[] args) {
        double[] mainArr = {4.6, 8.7, 2.5, 6.5};
        printArr(mainArr);
        doubleArr(mainArr);
        printArr(mainArr);

    }

    public static void doubleArr(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void printArr(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
