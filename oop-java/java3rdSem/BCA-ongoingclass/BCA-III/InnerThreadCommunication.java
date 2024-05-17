class SharedResource {
    private boolean flag = false;

    public synchronized void waitForFlag() {
        while (!flag) {
            try {
                wait(); // Wait until notified
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Flag is now true!");
    }

    public synchronized void setFlag() {
        flag = true;
        notify(); // Notify waiting threads
    }
}

class WaitThread extends Thread {
    private SharedResource resource;

    public WaitThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.waitForFlag();
    }
}

class NotifyThread extends Thread {
    private SharedResource resource;

    public NotifyThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.setFlag();
    }
}

public class InnerThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        WaitThread waitThread = new WaitThread(resource);
        NotifyThread notifyThread = new NotifyThread(resource);

        waitThread.start();
        notifyThread.start();

        try {
            waitThread.join();
            notifyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
