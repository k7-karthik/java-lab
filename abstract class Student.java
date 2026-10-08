// AbstractStudent.java

abstract class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    abstract void displayDetails();
}

class CollegeStudent extends Student {

    CollegeStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class AbstractStudent {
    public static void main(String[] args) {
        Student student = new CollegeStudent("Rahul", 101);

        student.displayDetails();
    }
}