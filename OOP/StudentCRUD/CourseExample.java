package CSC1350_Fall24.OOP.StudentCRUD;

public class CourseExample {
    public static void main(String[] args) {
        Course course = new Course("CSC 1350");
        Student student = new Student("john", 891);
        course.addStudent(student);
        student.addCourse(course);
        Faculty instructor = new Faculty("bob", 892);
        course.setInstructor(instructor);
    }
}
