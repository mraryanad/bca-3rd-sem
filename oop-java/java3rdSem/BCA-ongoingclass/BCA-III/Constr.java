import java.util.Scanner;
public class Constr{
    int modelNum;
    int modelYear;

    public Constr(int paramOne, int paramTwo){
        modelNum = paramOne;
        modelYear = paramTwo;
    }

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the model number");
        int model = keyboard.nextInt();
        System.out.println("Inter the Production Year");
        int year = keyboard.nextInt();
        Constr myCar = new Constr(model, year);
        System.out.println(myCar.modelNum +" and " + myCar.modelYear);
    }
}
