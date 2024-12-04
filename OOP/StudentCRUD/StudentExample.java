package CSC1350_Fall24.OOP.StudentCRUD;

import java.util.*;

public class StudentExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //arrayList of students
        ArrayList<Student> studentDB = new ArrayList<>();

        printMenu();
        while (true) {
            System.out.print("Enter a menu option: ");
            int n = in.nextInt();
            in.nextLine();
            switch (n) {
                case 1:
                    printMenu();
                    break;
                case 2: // add student
                    System.out.println("Add a student");
                    System.out.print("Enter student name: ");
                    String name = in.nextLine();

//                  //add student
                    Student s = new Student(name); //create student object
                    studentDB.add(s); //add student object to arraylist
                    System.out.println("Student " + s.getName() + " added to the database with an ID of " + s.getID());
                    break;
                case 3: //edit major
                    System.out.println("Change major");
                    System.out.print("Enter student's ID number to update major: ");
                    int id = in.nextInt();
                    in.nextLine();
                    Student student = findStudent(id, studentDB); //find object in array list and return reference to object
                    if(student != null){ //if student was found
                        System.out.print("Enter student's major: ");
                        String major = in.nextLine();
                        student.setMajor(major);
                    }
                    else System.out.println("Student not found");

                    break;
                case 4:
                    System.out.println("Delete student from class");
                    System.out.print("Enter student's ID number to delete: ");
                    int idToDelete = in.nextInt();
                    Student studentToDelete = findStudent(idToDelete, studentDB);
                    if(studentToDelete != null){ //if student was found
                        studentDB.remove(studentToDelete); //delete student object from arraylist
                        System.out.println( studentToDelete.getName() + " deleted from database.");
                    }
                    else System.out.println("Student not found");
                    break;
                case 5:
                    System.out.println("Current students in database");
                    int count = 0;
                    for (Student student1 : studentDB){
                        count++;
                        student1.printInfo();

                    }
                    if (count == 0){
                        System.out.println("no students in database");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }

    }
    public static Student findStudent(int ID, ArrayList<Student> s){
        for(Student student : s){
            if(student.getID() == ID){ //find student in arraylist that has ID being searched for
                return student;
            }
        }

        return null;

    }

    public static void printMenu(){
        System.out.println("" +
                "1. Print menu\n" +
                "2. Add Student\n" +
                "3. Change major\n" +
                "4. Delete Student\n" +
                "5. Print Students\n" +
                "6. Exit");
    }
}
