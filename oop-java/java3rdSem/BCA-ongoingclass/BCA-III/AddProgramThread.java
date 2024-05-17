class AddThread extends Thread {
    private int a, b;

    public AddThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        int sum = a + b;
        System.out.println("Sum by extending Thread class: " + sum);
    }
}

public class AddProgramThread {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        AddThread addThread = new AddThread(num1, num2);
        AddThread addThread1 = new AddThread(num1, num2);


        
        addThread.start();
        addThread1.start();
    }
}
