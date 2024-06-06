import java.util.Scanner;

class Recursion {

  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scan = new Scanner(System.in);
    int factorialNum = scan.nextInt();

    factorialFunc(factorialNum);
    System.out.println(factorialNum);

    scan.close();
  }

  static int factorialFunc(int factorialNum) {
    if (factorialNum >= 1) {
      return factorialNum * factorialFunc(factorialNum - 1);
    } else return 1;
  }
}
