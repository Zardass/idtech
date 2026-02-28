package lesson35;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);//nece thread prossesde istirak edecek mainden elave
        Runnable worker =()-> {

            try {
                System.out.println(Thread.currentThread().getName() + " runnig");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " ran");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupted();
            }
            finally {
                latch.countDown();//azaldri 3 2 1 0
            }
        };

        new Thread(worker,"Worker - 1").start();
        new Thread(worker,"Worker - 2").start();
        new Thread(worker,"Worker - 3").start();

        latch.await();//count 0 olana qeder gozleyir

        System.out.println("All thread done.Main thread continues");


    }


}
