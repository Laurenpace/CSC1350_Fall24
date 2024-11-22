package CSC1350_Fall24.Sorting_Searching;

public class LinearSearch {
    public static int linearSearch(int[] values, int searchVal) {
        int pos = -1;
        int i = 0;

        boolean finishedSearch = false;
        while (!finishedSearch){
            if (i == values.length) {
                finishedSearch = true;
            }
            else if (values[i] == searchVal) {
                
                pos = i;
                finishedSearch = true;
            }
            i++;
        }
        System.out.println(i);
        return pos;
    }

//    public static int linearSearch(int[] values, int searchVal) {
//        int pos = -1;
//        for (int i = 0; i < values.length; i++) {
//            if (values[i] == searchVal) {
//                pos = i;
//                break;
//            }
//
//        }
//        return pos;
//    }

        public static void main(String[] args) {
        int[] myArray = {1, 6, 2, 13, 20};
//        int[] myArray = {4, 9, 100, 4, 6, 12};
        int pos = linearSearch(myArray, 13);

        if (pos != -1) {
            System.out.println("Found at position: " + pos);
        } else {
            System.out.println("Not found");
        }
    }
    }

