package CSC1350_Spring24.Arrays;

public class MultiplyByFactor {
    public static void main(String[] args) {
        double[] arr = {1, 4, 3, 6, 7};
        multiply(arr, 11);
    }
    public static void multiply(double[] data, double factor){

        for (int i = 0; i < data.length; i++)
            data[i] = data[i] * factor; //changing array in main method
    }

}
