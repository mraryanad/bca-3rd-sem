import java.util.Scanner;
public class TrySum {
    public static void main(String[] args) {
    System.out.println("Type two numbers");
    sum();
}

private static void sum(){
    int a = 0;
    int b = 0;
    Scanner scan = new Scanner(System.in);
    try {
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a+b);
    } catch (Exception ex) {
        System.err.println("Type numbers in correct format!");
        sum();
    }
}
    
}
