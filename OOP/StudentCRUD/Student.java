package CSC1350_Fall24.OOP.StudentCRUD;

import java.util.ArrayList;

public class Student {

    private String name;
    private int ID; //89 num
    private String major;

    private boolean isEnrolled;

    public static int IDCount = 0;

    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.ID = createID();
        this.major = "undeclared";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    //no setter for ID, want it to be immutable

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourse(Course c){
        courses.add(c);
    }

    public void printInfo(){
        System.out.println(name + " " + major);

    }

    private int createID(){
        IDCount++;
        return Integer.parseInt(89 + "" + IDCount);
    }
}
