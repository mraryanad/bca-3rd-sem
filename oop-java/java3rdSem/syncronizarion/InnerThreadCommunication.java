package syncronizarion;

class InnerThreadCommunication {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                printer.printLetters();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                printer.printNumbers();
            }
        });

        thread1.start();
        thread2.start();
    }
}

class Printer {
    private char letter = 'a';
    private int number = 1;

    public synchronized void printLetters() {
        for (int i = 0; i < 13; i++) {
            System.out.print(letter++);
            notify(); // Notify other thread
            try {
                wait(); // Wait for other thread to print
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printNumbers() {
        for (int i = 0; i < 6; i++) {
            System.out.print(number++);
            notify(); // Notify other thread
            try {
                wait(); // Wait for other thread to print
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
