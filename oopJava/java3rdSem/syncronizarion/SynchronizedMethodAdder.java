package syncronizarion;

public class SynchronizedMethodAdder {
    private int sum = 0;

    public synchronized void add(int value) {
        sum += value;
    }

    public synchronized int getSum() {
        return sum;
    }
}
