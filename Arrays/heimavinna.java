package CSC1350_Fall24.Arrays;

import java.util.Scanner;

public class heimavinna {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(";");
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].contains("-")){
                String[] nums = strings[i].split("-");
//                System.out.println(nums[0]);
//                System.out.println(nums[1]);
                sum += Integer.parseInt(nums[1]) - Integer.parseInt(nums[0]) + 1;
            }
            else sum += 1;

        }

        System.out.println(sum);
    }









}

/*
import java.util.Scanner;

public class heimavinna {
    //1x
    //9
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int total = 0;
        String[] sArr = s.split(";");
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].contains("-")) {
                String[] dashed = sArr[i].split("-");
                total  += (Integer.parseInt(dashed[1]) - Integer.parseInt(dashed[0]) + 1);
            }
            else{
                total++;
            }

        }
        System.out.println(total);
    }}
 */
