public class TryCatchExampleOne {

  public static void main(String[] args) throws Exception {
    int x = -5;
    int y = -10;

    try {
      if (x < 0 || y < 0) {
        throw new Exception("x and y must be positive");
      }
      int sum = x + y;
      System.out.println("The sum of x and y is: " + sum);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Existing Program");
    }
  }
}
