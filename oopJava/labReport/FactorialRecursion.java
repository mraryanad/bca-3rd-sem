// WAP to calculate factorial of 'n' using recursion

package labReport;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
