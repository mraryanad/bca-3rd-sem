// WAP to take username & password from the user and the database password stored in a variable is 'db_admin = admin@gmail.com' & 'password = 16qrxmvt'. Also check whether the user has typed the password or not and also check for unnecessary whitespaces in the inputs

import java.util.Scanner;

class StringUserValidation {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Your User Name: ");
    String userName = scan.nextLine();

    System.out.println("Enter Your Password: ");
    String password = scan.nextLine();

    UserValidation(userName, password);

    scan.close();
  }

  public static void UserValidation(String userName, String password) {
    String db_admin = "admin@gmail.com";
    String db_password = "16qrxmvt";

    if (userName.length() == 0 && password.length() == 0) {
      System.out.println(
        "Invalid Credentials!!!\nPlease enter the correct username and password."
      );
      return;
    }

    if (
      userName.trim().equalsIgnoreCase(db_admin) &&
      password.trim().equalsIgnoreCase(db_password)
    ) {
      System.out.println("Logged In Successfully!");
    } else {
      System.out.println(
        "Invalid Credentials!!!\nPlease enter the correct username and password."
      );
    }
  }
}
