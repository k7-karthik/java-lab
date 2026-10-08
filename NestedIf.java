public class NestedIf {

    public static void main(String[] args) {

        int num = 1;

        if (num < 10) {
            if (num == 1) {
                System.out.println("The value is equal to 1");
            } else {
                System.out.println("The value is greater than 1");
            }
        } else {
            System.out.println("The value is greater than 10");
        }

        System.out.println("Nested if-else statement");
    }
}