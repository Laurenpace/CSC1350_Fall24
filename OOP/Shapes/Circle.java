package CSC1350_Spring24.OOP.Shapes;

public class Circle{
    private double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    //area
    public double area(){
        return Math.PI * radius * radius;
    }

    //circumference
}
