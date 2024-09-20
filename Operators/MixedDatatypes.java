package CSC1350_Fall24.Operators;

public class MixedDatatypes {
    public static void main(String[] args) {
        int x = 5;
        double y = 2.2;
        double average =  ((x + y) / 2);
        System.out.println(average);

//        //error due to precedence, casting has precedence over division
//        //x + y is converted to an int and then divided by a double making the result a double
//        int averageError1 = (int)(x+y) /2.0;
//
//        //type mismatch
//        int averageError2 = (x + y) / 2.0;
        int averageCast = (int)(x+y /2.0);
        System.out.println(averageCast);
//
        double doubleAverage = (x + y) / 2;
        System.out.println(doubleAverage);


    }
}
