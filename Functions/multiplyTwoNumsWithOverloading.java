package CSC1350_Fall24.Functions;

public class multiplyTwoNumsWithOverloading {
    public static void main(String[] args) {
        int multipliedNums = multiplyTwoNums(4, 5);
        System.out.println(multiplyTwoNums(4, 5));
        System.out.println(multiplyTwoNums(3.2, 6.8));
    }
    public static int multiplyTwoNums(int num1, int num2){
        return num1 * num2;
    }

    public static double multiplyTwoNums(double num1, double num2){
        return num1 * num2;
    }
}
