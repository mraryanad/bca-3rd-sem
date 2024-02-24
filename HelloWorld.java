import java.util.Scanner;

class HelloWorld {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("\nSum of the two numbers: " + addFunc(a, b));
  }

  public static int addFunc(int a, int b) {
    return a + b;
  }
}
