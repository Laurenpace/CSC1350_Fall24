package CSC1350_Fall24.Functions;

public class ReturnArray {
    public static void main(String[] args) {
        int[] numbers = squares(10);
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    public static int[] squares(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = i * i;
        }
        return result;
    }
}

