package CSC1350_Fall24.SelectionStatements;

public class RandomNums {
    public static void main(String[] args) {

        //Math.random() returns a random double from zero to one (0 >= num < 1)
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        //To generate a floating point number
        //  range multiply by the max value you want (exclusive)
        double randomNum = Math.random() * 5; //0 <= randomNum < 5
        System.out.println(Math.random() * 5);
        System.out.println(Math.random() * 5);
        System.out.println(Math.random() * 5);
        System.out.println(Math.random() * 5);


        /*To generate integers you must cast to an int
        you can also set a range by adding the number
        want your range to start at */

        //Generate numbers from 1 to 10 (inclusive)
        System.out.println((int)(Math.random() * 10)  + 1);



        int min = 10;
        int max = 20;

        //To generate a random number in the range [min, max]
        int num = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(num);
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));

    }
}
