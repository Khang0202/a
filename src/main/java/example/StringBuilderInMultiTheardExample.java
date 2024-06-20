package example;

/**
 * StringBuilder in MultiThread example
 *
 * Bug example:
 * Thread 1xxxxxxxxxx
 * xxxxxxxx
 * Thread 2x
 * Thread 1
 * Thread 2xxxxxxxx
 * Thread 2
 * xThread 2Thread 12
 * Thread 2xxxxxxxx
 * Thread 2
 * xThread 1
 * Thread 1
 * Thread 1
 * Thread 1
 * Thread 1
 * Thread 1
 * Thread 1
 */
public class StringBuilderInMultiTheardExample implements Runnable{
    static StringBuilder string = new StringBuilder();

    public static void main(String[] args) {
        Thread t1 = new Thread(new StringBuilderInMultiTheardExample(), "Thread 1");
        Thread t2 = new Thread(new StringBuilderInMultiTheardExample(), "Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(string);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            string.append(Thread.currentThread().getName()).append("\n");
        }
    }
}