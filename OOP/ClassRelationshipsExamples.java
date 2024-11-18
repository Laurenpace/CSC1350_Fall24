package CSC1350_Spring24.OOP;

import java.util.ArrayList;

class Department{
    private String name;
    private ArrayList<Faculty> facultyMembers = new ArrayList<>();
    private University uniName;
    public Department(String name, University uniName){
        this.name = name;
        this.uniName = uniName;

    }
    public void addFaculty(Faculty f){
        facultyMembers.add(f);
    }
}

class Faculty{
    private String name;
    private String title;
//    private String salary;

    private Department department;

    public Faculty(String name, String title){
        this.name = name;
        this.title = title;

    }
    public void setDepartment(Department d){
        department = d;
    }
}

class University{
    private String name;
    private ArrayList<Department> departments;

    public University(String name, Department department){
        this.name = name;
        departments.add(department);
    }

    public void addDepartment(Department department){
        departments.add(department);
    }
}
public class ClassRelationshipsExamples {
    public static void main(String[] args) {

    }
}
