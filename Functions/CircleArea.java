package CSC1350_Fall24.Functions;

public class CircleArea {

    public static void main(String[] args) {
        printCircleArea(5);
    }
    public static void printCircleArea(double r){

        double area = Math.PI * r * r;
        System.out.printf("Circle area is: %.2f\n", area);
    }
}