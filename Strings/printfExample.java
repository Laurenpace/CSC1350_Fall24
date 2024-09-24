package CSC1350_Fall24.Strings;

public class printfExample {
    public static void main(String[] args) {

        int price = 50;
        double tax = 0.05;
        System.out.printf("price: %d, tax: %.2f\n", price, tax);

        System.out.println();

        int var = 1234;
        System.out.printf("%8d%8s%8.1f\n", var, "Java", 5.63);
        System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 5.63);
        System.out.printf("%-8d%-8s%-8.1f\n", 1234555, "Python", 5.63);
        System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 5.63);


        System.out.println();

        double num = 4.333;
        System.out.println(num);
        System.out.printf("%.2f", num);

        System.out.println();
        double var2 = 4.85579;
        System.out.printf("%.2f\n", 4.85579);
        System.out.printf("%.2f\n", var2);


    }
}
