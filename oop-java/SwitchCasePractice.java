// switch case
// 1. (a+b)^2
// 2. (a-b)^2
// 3. root under (a-2ab)/4a
// 4. a^2 b^2 - 2ab

import java.util.Scanner;

class SwitchCasePractice {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int userChoice;
    double a, b;

    System.out.println("Enter 'a' and 'b': ");
    a = scan.nextDouble();
    b = scan.nextDouble();

    System.out.println(
      "\nChoose an option to perform the respective calculation: \n 1. (a+b)^2 \n 2. (a-b)^2 \n 3. square root of (a-2ab)/4a \n 4. a^2 b^2 - 2ab"
    );
    userChoice = scan.nextInt();

    switchCaseLogic(userChoice, a, b);
    scan.close();
  }

  public static void switchCaseLogic(int userChoice, double a, double b) {
    double result;

    switch (userChoice) {
      case 1:
        result = Math.pow((a + b), 2);
        System.out.println("\nAnswer: " + result);
        break;
      case 2:
        result = Math.pow((a - b), 2);
        System.out.println("\nAnswer: " + result);
        break;
      case 3:
        result = Math.sqrt(Math.abs((a - (2 * a * b)) / (4 * a)));
        System.out.println("\nAnswer: " + result);
        break;
      case 4:
        result = (Math.pow(a, 2) * Math.pow(b, 2)) - (2 * a * b);
        System.out.println("\nAnswer: " + result);
        break;
      default:
        System.out.println(
          "\n\nINVALID CHOICE!!!\nPlease Enter a valid choice (1-4).\n"
        );
        break;
    }
  }
}
