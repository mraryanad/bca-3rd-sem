package synchronization;

public class SynchronizationBlockExample{
    private int sum = 0;
    private final Object lock = new Object();

    public void add(int value){
        synchronized(lock){
            sum += value;
        }
    }

    public int getSum(){
        synchronized(lock){
            return sum;
        }
    }
}