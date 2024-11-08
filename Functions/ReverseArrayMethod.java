package CSC1350_Fall24.Functions;

public class ReverseArrayMethod {
    public static void main(String[] args) {
        int[] list1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length]; // creates new array result
        for (int i = 0, j = result.length - 1; // copies elements from array
             i < list.length; i++, j--) { // list to array result
            result[j] = list[i];
        }
        return result;
    }
}
