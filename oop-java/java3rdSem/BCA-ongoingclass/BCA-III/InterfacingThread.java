class InterfacingThread implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        InterfacingThread m1 = new InterfacingThread();
        Thread thread1 = new Thread(m1);
        thread1.start();

        InterfacingThread m2  = new InterfacingThread();
        Thread thread2 = new Thread(m2);
        thread2.start();
    }
}
