package CSC1350_Fall24.SelectionStatements;

public class AND {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;


        if(num1 == num2 && num1 > num2){
           System.out.println("if is false");
        }
        else System.out.println("false and false is false");


        if(num1 > num2 && num2 > 0){
            System.out.println("if is false");
        }
        else System.out.println("false and true is false");


        if(num1 > 0 && num2 > 10){
            System.out.println("if is false");
        }
        else System.out.println("true and false is false");


        if(num1 < 10 && num2 > 0){
            System.out.println("true and true is true");
        }
    }
}
