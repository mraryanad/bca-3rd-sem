# Chapter - 7 (Thread)

<b>Direction or Path that is taken while a program is being executed (It is a task or activity). Generally, all the program have at least one thread, known as the main thread, which is provided by the JVM</b>

## States of Thread

- New
- Runnable
- Running
- Non-Runnable (Blocked)
- Terminate

## Thread Creation

<b>When you extend a `Thread` class, you are creating a new class that directly inherits from `Thread` and overrides its `run()` method. Example:</b>

- By extending thread class

```
class AddThread extends Thread {
    private int a, b;

    public AddThread(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        int sum = a + b;
        System.out.println("Sum by extending Thread Class: " + sum);
    }
}

public class AddThreadProgram{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        AddThread addThread = new AddThread(num1, num2);
        AddThread addThread1 = new AddThread(num1, num2);

        addThread.start();
        addThread1.start();
    }
}
```

## Synchronization

`When more than one thread try to access a shared resource, we need to ensure that resources will be used by only one thread at a time. The process by which this is achieved is known as synchronization.`

</br>

`Types: `</br>

- Mutual Exclusive
- Inter-Thread Communication

</hr>

1.  Mutual Exclusive types

    - Synchronized Method
    - Synchronized Block

      a) Synchronized Method</br>
      `Example:`

      ```

      ```

      b) Synchronized Block</br>
      `Example:`

      ```
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
      ```
