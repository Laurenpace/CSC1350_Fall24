package CSC1350_Fall24.OOP.StudentCRUD;

import java.util.ArrayList;

public class Course {
    private String name;
    private Faculty instructor;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    public void addStudent(Student s){

        students.add(s);
        s.addCourse(this);
    }

    public void dropStudent(Student s){
        students.remove(s);
    }
}
