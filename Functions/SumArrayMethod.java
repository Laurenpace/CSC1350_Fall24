package CSC1350_Spring24.Arrays;

public class SumArrayMethod {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arg){
        int sum = 0;
        for (int i = 0; i < arg.length; i++) {
            sum += arg[i];
        }
        return sum;
    }
}
