import java.util.Scanner;

public class ConsoleInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int num1 = sc.nextInt();

    System.out.print("Enter a double: ");
    double num2 = sc.nextDouble();

    System.out.print("Enter a string: ");
    String str = sc.next();

    System.out.println("Integer: " + num1);
    System.out.println("Double: " + num2);
    System.out.println("String: " + str);
  }
}
