package Oops;

class Professor {

    String name;

    Professor(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Professor: " + name);
    }
}

class Department {

    String departmentName;
    Professor professor;

    Department(String departmentName, Professor professor) {
        this.departmentName = departmentName;
        this.professor = professor;
    }

    void displayDepartment() {
        System.out.println("Department: " + departmentName);
        professor.display();
    }
}

public class Aggregation {

    public static void main(String[] args) {

        Professor p = new Professor("Raja");

        Department d = new Department("Computer Science", p);

        d.displayDepartment();
    }
}
