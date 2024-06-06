package syncronizarion;

public class SynchronizedBlockAdder {
    private int sum = 0;
    private final Object lock = new Object();

    public void add(int value) {
        synchronized (lock) {
            sum = sum +  value;
        }
    }

    public int getSum() {
        synchronized (lock) {
            return sum;
        }
    }
}
