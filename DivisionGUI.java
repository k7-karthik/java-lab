import java.util.Scanner;

public class DivisionGUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Num1: ");
            int a = sc.nextInt();

            System.out.print("Enter Num2: ");
            int b = sc.nextInt();

            int res = a / b;

            System.out.println("Result: " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch (Exception e) {
            System.out.println("Please enter valid integers!");
        }

        sc.close();
    }
}