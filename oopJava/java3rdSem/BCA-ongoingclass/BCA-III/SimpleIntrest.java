import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the Principle");
        double p = keyboard.nextDouble();
        System.out.println("Enter the Time");
        double t = keyboard.nextDouble();
        System.out.println("Enter the Rate");
        double r = keyboard.nextDouble();
        double i = (p*t*r)/100;
        System.out.print("The Intrest of given is : "+ i);
    }
}
