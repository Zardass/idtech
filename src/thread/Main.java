package thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//      Runnable task = ()->
//        {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Thread name: " + Thread.currentThread().getName());
//        };
//
//
//        Runnable secondTask = ()-> System.out.println("Thread name: " + Thread.currentThread().getName());
//
//
//        //doesn't happen lock
//        Thread firstthread = new Thread(task);
//        Thread secondthread = new Thread(secondTask);
//        firstthread.start();
//        secondthread.start();

        //taskin icinde cagrilsa firstThread -0 verecek
      //  System.out.println(Thread.currentThread().getName());

//        Runnable firstTask = ()-> System.out.println("First Task: " + Thread.currentThread().getName());
//        Runnable secondTask = ()-> System.out.println("Second Task: " + Thread.currentThread().getName());
//
//        Thread firstThread = new Thread(firstTask);
//        Thread secondThread = new Thread(secondTask);
//
//        firstThread.start();
//        firstThread.join();
//        secondThread.start();
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
