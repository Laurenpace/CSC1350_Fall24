package CSC1350_Spring24.OOP.StudentCRUD;

import java.util.ArrayList;

public class Faculty {
    private String name;
    private int ID;

    private ArrayList<Course> courses;
    public Faculty(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}
