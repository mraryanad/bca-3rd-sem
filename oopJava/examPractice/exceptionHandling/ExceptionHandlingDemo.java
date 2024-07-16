package exceptionHandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the specific exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handling any other exception
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Code that will always execute, regardless of an exception
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}