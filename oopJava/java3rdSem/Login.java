import java.util.Scanner;

public class Login {
    int dbId = 1;
    int dbPw = 1;

    public static void main(String args[]) {
        loginSystem();

    }

    static void loginSystem() {
        Login login = new Login();
        System.out.println("Enter the Id");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        if (id == login.dbId) {
            System.out.println("ENter the Pw");

            int pw = s.nextInt();
            if (pw == login.dbPw) {
                System.out.println("Login Success");
            } else {
                System.out.println("Invalid Password");
                loginSystem();
            }
        } else {
            System.out.println("Invalid Id");
            loginSystem();
        }
    }
}
