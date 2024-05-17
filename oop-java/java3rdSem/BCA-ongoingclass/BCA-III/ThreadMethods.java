public class ThreadMethods {
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.setName("Thread 1");
        thread.start();

        MyThread thread2 = new MyThread();
        thread2.setName("Thread 2"); 
        thread2.start();
    }
}