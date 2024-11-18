package CSC1350_Spring24.OOP;

public class Enums {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day myDay = Day.MONDAY;
        System.out.println(myDay.name());

        Day tues = Day.TUESDAY;
        String string = tues.name();
    }
}
