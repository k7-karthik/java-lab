// Java Program to Demonstrate if-else-if Statement

public class IfElseIf {
    public static void main(String[] args) {

        int marks = 82;

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 35) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}