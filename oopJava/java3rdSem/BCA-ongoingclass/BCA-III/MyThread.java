public class MyThread extends Thread {
  public void run() {
    System.out.println("Running thread " + this.getName());
    this.setPriority(Thread.MAX_PRIORITY);
    this.setDaemon(true);
    
    try {
      this.join();
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted");
    }
    
    if (this.isAlive()) {
      System.out.println("Thread is still alive");
    }
    
    Thread.yield();
    Thread.currentThread().dumpStack();
  }
}