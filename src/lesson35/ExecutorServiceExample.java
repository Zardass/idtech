package lesson35;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
        }
        executorService.shutdown();
    }
}
