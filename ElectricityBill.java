import java.util.Scanner;

class ElectricityBill {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("\nEnter your consumed unit: ");
    int consumedUnit = scan.nextInt();

    CalculateBill.amntToPay(consumedUnit);
  }
}

class CalculateBill {

  public static void amntToPay(int consumedUnit) {
    int bill = 0;
    if (consumedUnit <= 20) {
      bill = consumedUnit * 12;
    } else if (consumedUnit <= 55) {
      bill = (20 * 12) + ((consumedUnit - 20) * 18);
    } else {
      bill = (20 * 12) + (35 * 18) + ((consumedUnit - 55) * 22);
    }

    System.out.println("Your electricity Bill is: Rs " + bill);
  }
}
