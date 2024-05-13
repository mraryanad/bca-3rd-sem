import java.util.Scanner;

class AreaOfTriangle {

  public static void area() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Length, Breadth and Height:");
    float length = scan.nextFloat();
    float breadth = scan.nextFloat();
    float height = scan.nextFloat();

    float area = 1 / 2 * (length * breadth * height);

    System.out.println("Area of Triangle: " + area);

    scan.close();
  }
}
