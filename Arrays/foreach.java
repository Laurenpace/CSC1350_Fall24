package CSC1350_Fall24.Arrays;

public class foreach {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12};
        for (int i : arr){
            System.out.println(i); //same as arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
