import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
       // Date date  = new Date(100000000);
//        System.out.println(Runtime.getRuntime().availableProcessors());

        List<Integer> list =List.of(1,2,3,4,5) ;
        list.parallelStream().
                forEach(number-> System.out.println("number: " + number + " Thread: " + Thread.currentThread().getName()));

    }
}
