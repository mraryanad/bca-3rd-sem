public class ThrowAdd {
  public static void main(String[] args) {
    int x = 5;
    int y = 10;

    try {
      if (x < 0 || y < 0) {
        throw new IllegalArgumentException("x and y must be positive");
      }

      int sum = x + y;
      System.out.println("The sum of x and y is: " + sum);
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}





