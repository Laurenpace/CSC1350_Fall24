package CSC1350_Fall24.Functions;

public class LocalVariables {
    public static void main(String[] args){

        double price = 10;
        double total = price + addTax(price, 7.5);
        System.out.println(total);
        System.out.println(price);
    }
    public static double addTax(double price, double rate){

        double tax = price * rate / 100;
        price = price + tax; // Has no effect outside the method
        return tax;
    }


}
