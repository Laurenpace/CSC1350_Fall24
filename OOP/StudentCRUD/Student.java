package CSC1350_Fall24.OOP.StudentCRUD;

import java.util.ArrayList;

public class Student {
    private String name;
    private int ID; //89 num
    private String major;

//    public boolean isEnrolled() {
//        return isEnrolled;
//    }
//
//    public void setEnrolled(boolean enrolled) {
//        isEnrolled = enrolled;
//    }
//
    private boolean isEnrolled;

    private ArrayList<Course> courses = new ArrayList<>();
    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.major = "undeclared";
//        this.isEnrolled = true;
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

    public void setID(int ID) {
        this.ID = ID;
    }

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
}
