import java.util.Scanner;

public class ArthematicCalc {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int numOne = keyboard.nextInt();
        System.out.println("Enter the number Two");
        int numTwo = keyboard.nextInt();
        add(numOne, numTwo);
        sub(numOne, numTwo);
        mul(numOne, numTwo);
    }


    static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static void sub(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }

    static void mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }

    static void div(int a, int b) {
        int div = a / b;
        System.out.println(div);
    }

    static void mod(int a, int b) {
        int mod = a % b;
        System.out.println(mod);
    }
}
