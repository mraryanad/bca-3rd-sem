public class Counter {

  static int x = 0;

  // Constructor (increments the value of x)
  Counter() {
    x++;
  }

  // Displays the value of x
  static void display() {
    System.out.println(x);
  }

  public static void main(String[] args) {
    // Create the instance of Counter
    Counter count1 = new Counter();
    Counter count2 = new Counter();
    Counter count3 = new Counter();

    // If the method is not static
    // count1.display();
    // count2.display();
    // count3.display();

    // If the method is static
    Counter.display();
    Counter.display();
    Counter.display();
  }
}
