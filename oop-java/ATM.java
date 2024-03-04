import java.util.Scanner;

public class ATM {

  // Default Access Modifier so that VAR can be accessed within the file
  static int savedPin = 2424;
  static int balance = 20300;
  static int incorrectAttempts = 0;
  static String bankName = "Kumari";

  public static void main(String[] args) {
    System.out.println(
      "------WELCOME TO KUMARI ATM SERVICE------\n\nPlease Enter Your PIN Code below to get started"
    );

    // Loop until user is Blocked or has entered correct PIN
    for (int retries = 3; retries > 0; retries--) {
      Scanner scan = new Scanner(System.in);

      System.out.print("\n👉 Enter PIN Code: ");
      int userPin = scan.nextInt();

      // If PIN is correct, then run remaining code and break out of the loop
      if (userPin == savedPin) {
        System.out.println("\n\n---------Successfully Logged In---------\n");
        ifUserValid();
        break;
      } else {
        // If PIN is incorrect, then print error message and decrement retries until user is blocked
        System.out.println(
          "\nINCORRECT PIN CODE (" + (retries - 1) + " Retries Remaining)\n"
        );
        incorrectAttempts++;
        if (incorrectAttempts >= 3) {
          System.out.println(
            "------------------------------------------------------\nYOUR SERVICE HAS BEEN BLOCKED!!!\nPLease contact the bank to unblock your ATM service...\n------------------------------------------------------"
          );
          break;
        }
      }
    }
  }

  public static void ifUserValid() {
    Scanner scan = new Scanner(System.in);

    System.out.print("\n👉 Enter Your Bank Name: ");
    String userBankName = scan.nextLine();

    // Convert both string into lowercase and check if they are same. Deduct Rs 10 if different and Skip this step if same
    // if (userBankName.toLowerCase() != bankName.toLowerCase()) { // compares object references, not their content (wasted 50 minutes)
    if (!userBankName.equalsIgnoreCase(bankName)) { // Compares ignoring their case
      System.out.println(
        "\n\n-------------------------------------------------------------\nRs 10 will be deducted for withdrawals from a different bank.\n-------------------------------------------------------------\n"
      );

      balance -= 10;
    }

    System.out.print(
      "\n👉 Enter the amount to be withdrawn (in multiples of 500): "
    );
    int withdrawalAmount = scan.nextInt();

    // Check if withdrawal amount is multiple of 500 and less than or equal to balance, print an error message and terminate if invalid
    if (withdrawalAmount % 500 == 0 && withdrawalAmount <= balance) {
      balance -= withdrawalAmount;
      System.out.println(
        "\n\n----------------------------------\nRs " +
        withdrawalAmount +
        " withdrawn successfully!!!\n----------------------------------"
      );
      System.out.println("\nYour Remaining balance is Rs " + balance);
    } else {
      System.out.println(
        "\n\n--------------------------------------------------\nInvalid withdraw amount or Insufficient Balance!!!\n--------------------------------------------------\n"
      );
    }
  }
}
