package CSC1350_Fall24.Inheritance;

import java.util.ArrayList;

class Course {
    private String name;
    private Faculty instructor;
    private ArrayList<Student> students = new ArrayList<>();
    private int section;
    public Course(String name, int Section) {
        this.name = name;
        this.section = Section;
    }

    public void setInstructor(Faculty instructor) {
        instructor.addCourse(this);
        this.instructor = instructor;
    }

    public void addStudent(Student s){

        students.add( s);
    }


}

class User{
    private String name;
    private String email;
    private int ID;
    protected static int IDCount = 10000;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        ID = createID();
    }

    private int createID(){
        IDCount++;
        return Integer.parseInt(89 + "" + IDCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString(){
        return name + " " + email + " " + ID;
    }
}


class Faculty extends User{

    private String role;
    private ArrayList<Course> courses= new ArrayList<>();

    public Faculty(String name, String email, String role) {
        super(name, email);
        this.role = role;
    }
    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public String toString(){
        return super.toString() + " " + role ;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

class Student extends User {
    private ArrayList<Course> courses = new ArrayList<>();
    private String major;

    public Student(String name, String email) {
        super(name, email);
        major = "undeclared";
    }
    public void addCourse(Course c){
        courses.add(c);
        c.addStudent(this);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return super.toString() + " " + major;
    }

}
public class LSU_Users {
    public static void main(String[] args) {
        User maintenance = new User("john", "john@lsu.edu");
        Student s1 = new Student("sam", "sam@lsu.edu");
        Student s2 = new Student("jill", "jill@lsu.edu");
        System.out.println(s1.getID());
        System.out.println(s2.getID());
        Course csc1350 = new Course("CSC1350", 1);
        s1.addCourse(csc1350);
        Faculty f1 = new Faculty("Billie Smith", "bsim@lsu.edu", "instructor");
        csc1350.setInstructor(f1);
        s2.addCourse(csc1350);
        ArrayList<User> users = new ArrayList<>();
        users.add(maintenance);
        users.add(s1);
        users.add(s2);
        users.add(f1);

        System.out.println(f1);
        System.out.println(s1);
        System.out.println(maintenance);


    }
}
