package syncronizarion;

public class Main {
    public static void main(String[] args) {
        // Synchronized Block Example
        SynchronizedBlockAdder blockAdder = new SynchronizedBlockAdder();
        Runnable blockRunnable = new BlockRunnable(blockAdder);
        Thread t1 = new Thread(blockRunnable);
        Thread t2 = new Thread(blockRunnable);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Synchronized Block Example - Sum: " + blockAdder.getSum());

        // Synchronized Method Example
        SynchronizedMethodAdder methodAdder = new SynchronizedMethodAdder();
        Runnable methodRunnable = new MethodRunnable(methodAdder);
        Thread t3 = new Thread(methodRunnable);
        Thread t4 = new Thread(methodRunnable);
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Synchronized Method Example - Sum: " + methodAdder.getSum());
    }
}

class BlockRunnable implements Runnable {
    private SynchronizedBlockAdder blockAdder;

    public BlockRunnable(SynchronizedBlockAdder blockAdder) {
        this.blockAdder = blockAdder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            blockAdder.add(1);
        }
    }
}

class MethodRunnable implements Runnable {
    private SynchronizedMethodAdder methodAdder;

    public MethodRunnable(SynchronizedMethodAdder methodAdder) {
        this.methodAdder = methodAdder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            methodAdder.add(1);
        }
    }
}
