class AddRunnable implements Runnable {
    private int a, b;

    public AddRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        int sum = a + b;
        System.out.println("Sum by implementing Runnable interface: " + sum);
    }
}

public class AddProgramRunnable {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        int num3 = 6;
        int num4 = 8;

        AddRunnable addRunnable = new AddRunnable(num1, num2);
        AddRunnable addRunnable2 = new AddRunnable(num4, num3);

        Thread thread = new Thread(addRunnable);
        Thread thread2 = new Thread(addRunnable2);
        thread.start();
        thread2.start();
    }
}
