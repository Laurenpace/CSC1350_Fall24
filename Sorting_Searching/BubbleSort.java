package CSC1350_Fall24.Sorting_Searching;
//
public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {5, 2, 3, 7, 1};
        int[] arr = {1, 2, 5, 4, 7, 8, 9, 10};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);

    }
    public static void bubbleSort(int[] array){
        boolean sorted = false;
        int i = 1;	//loop initialization
        int temp = 0;
        //loop condition
        while (!sorted) {
            if (i == array.length) {
                sorted = true;
            }
            else {
                sorted = true;
                for(int j = 0; j < array.length-i; j++){
                    if(array[j] > array[j+1]) {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        sorted = false;
                    }
                }
                printArray(array);
                System.out.println();
            }
            i++; //loop update
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
