public class Interrupt extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("javatpoint");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted..." + e);

        }
    }

    public static void main(String args[]) {
        Interrupt thread1 = new Interrupt();
        thread1.start();
        try {
            thread1.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }
    }
}
