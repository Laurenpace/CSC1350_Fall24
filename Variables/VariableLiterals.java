package CSC1350_Fall24.Variables;

public class VariableLiterals {
    public static void main(String[] args) {
        int numInt = 4; //Declare an int

        short numShort = 4; //Declare a short

        long numLong = 455555555L; //Declare a long
        //'L' is required if the number is <32 bits,
        //otherwise java will treat the number as an int

        double numDouble = 4.0; //Declare a double

        float smallerDouble = 4.0F; //Declare a float
        //'F' required if you want it to be a float,
        //otherwise java will store number as a double to have more precision
    }
}