package CSC1350_Spring24.OOP;

public class WrapperClass {
    public static void main(String[] args) {
        String s = "4";
        Integer i = Integer.valueOf(s);
        System.out.println(i);
        System.out.println(i + 1);
        Integer i1 = 4;
        System.out.println(i1);
        System.out.println(i1 + 1);


        int num = Integer.parseInt(s);
        double dNum = Double.parseDouble("4.3");
        System.out.println(num + 1);
        System.out.println(dNum + 1);


    }
}
