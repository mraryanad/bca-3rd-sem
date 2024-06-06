public class ThreadStop extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ThreadStop thread1 = new ThreadStop();
        ThreadStop thread2 = new ThreadStop();
        ThreadStop thread3 = new ThreadStop();
        thread1.start();
        thread2.start();
        thread3.stop();
        System.out.println("Thread thread3 is stopped");
    }
}