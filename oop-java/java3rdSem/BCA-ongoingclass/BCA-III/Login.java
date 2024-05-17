import java.util.Scanner;

public class Login {
    int dbId = 1;
    int dbPw = 222;
    int id, pw;

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Login login = new Login();
        // Taking input from user for ID
        System.out.println("Enter the User ID");
        login.id = keyboard.nextInt();

        // Taking input from user for PW if ID exist
        if (login.id == login.dbId) {
            System.out.println("We found your id!! \n Enter the Password");
            login.pw = keyboard.nextInt();
            if (login.pw == login.dbPw) {
                System.out.println("Yahoooo! Login Success!! \n Now enter the pattern row");
                int patternRow = keyboard.nextInt();
                for (int i = 0; i < patternRow; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Sorry Password is incorrect");
            }
        } else {
            System.out.println("Sorry User Doesnt Exist");
        }
    }
}
