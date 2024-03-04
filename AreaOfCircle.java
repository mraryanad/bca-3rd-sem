import java.util.Scanner;

class AreaOfCircle {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("\nEnter radius (r): ");
    float radius = scan.nextFloat();

    float area = (22 / 7) * radius * radius;

    System.out.println("Area of circle: " + area);

    AreaOfTriangle triangle = new AreaOfTriangle();
    triangle.area();
    // AreaOfTriangle.area();
  }
}
