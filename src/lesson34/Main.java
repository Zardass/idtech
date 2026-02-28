package lesson34;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Runnable firstTask = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        };
        Runnable secondTask = () -> {
            for (int i = 1000; i >=1; i--) {
                counter.decrement();
            }
        };

        Thread thread1 = new Thread(firstTask);
        Thread thread2 = new Thread(secondTask);
        thread1.start();
      //  thread1.join();
        thread2.start();

      //  Thread.sleep(2000);


        System.out.println("count: " + counter.getCount());

    }
}

    class Counter {
        int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized void decrement() {
            count--;
        }

        public int getCount() {
            return count;
        }
    }

