package CSC1350_Fall24.Functions;

public class Scope {
    public static int square(int n){

        int result = n * n;
        return result;
    }

    public static void main(String[] args){

        int result = square(3) + square(4);
        System.out.println(result);
    }
}
