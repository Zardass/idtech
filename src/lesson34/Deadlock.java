package lesson34;

public class Deadlock {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread("lock1","lock2");
        SecondThread secondThread = new SecondThread("lock1","lock2");
        firstThread.start();
        secondThread.start();

    }
}

class FirstThread extends Thread {
    private final Object lock1;
    private final Object lock2;

    public FirstThread(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock1) {
            System.out.println("First Thread,holding lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            System.out.println("First Thread,waiting for lock2");
            synchronized (lock2) {
                System.out.println("First Thread,acquired lock2");
            }
        }
    }
}

class SecondThread extends Thread {
    private final Object lock1;
    private final Object lock2;

    public SecondThread(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock1) {
            System.out.println("Second Thread,holding lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Second Thread,waiting for lock1");
            synchronized (lock2) {
                System.out.println("Second Thread,acquired lock1");
            }
        }

    }
}
