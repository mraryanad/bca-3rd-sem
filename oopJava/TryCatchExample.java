import java.io.*;

public class TryCatchExample {

  public static void main(String[] args) {
    try {
      int a[] = new int[2];
      System.out.println("Access Element Three: " + a[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception Thrown: " + e);
    }

    System.out.println("Out of the block.");
  }
}
// Output
// Exception Thrown: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
// Out of the block.
