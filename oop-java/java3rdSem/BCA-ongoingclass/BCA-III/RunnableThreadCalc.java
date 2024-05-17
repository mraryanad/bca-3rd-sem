public class RunnableThreadCalc implements Runnable {
  private int num1;
  private int num2;
  private String operation;

  public RunnableThreadCalc(int num1, int num2, String operation) {
    this.num1 = num1;
    this.num2 = num2;
    this.operation = operation;
  }

  public void run() {
    int result = 0;
    switch (operation) {
      case "add":
        result = num1 + num2;
        break;
      case "subtract":
        result = num1 - num2;
        break;
      case "multiply":
        result = num1 * num2;
        break;
      case "divide":
        result = num1 / num2;
        break;
    }
    System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
  }

  public static void main(String[] args) {
    RunnableThreadCalc pOne = new RunnableThreadCalc(10, 5, "add");
    Thread t1 = new Thread(pOne);
    Thread t2 = new Thread(new RunnableThreadCalc(10, 5, "subtract"));
    Thread t3 = new Thread(new RunnableThreadCalc(10, 5, "multiply"));
    Thread t4 = new Thread(new RunnableThreadCalc(10, 5, "divide"));

    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
