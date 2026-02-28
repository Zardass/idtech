import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTasks {
    public static void main(String[] args) {
        evenNumbers();
        uppercase();
        greaterThanTen();
        removeNullValues();
        firstElementStartingWithA();
        squareAndSorted();
        sumOfAllEvenNumbers();
        convertingMap();
        findMaxNum();


    }

    public static void evenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = numbers.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list);
    }

    public static void uppercase() {
        List<String> names = List.of("java", "stream", "api")
                .stream()
                .map(x -> x.toUpperCase())
                .toList();
        System.out.println(names);
    }

    public static void greaterThanTen() {
        List<Integer> nums = List.of(5, 10, 15, 20)
                .stream()
                .filter(x -> x >= 10)
                .toList();
        System.out.println(nums);
    }

    public static void removeNullValues() {
        List<String> data = Arrays.asList("A", null, "B", null, "C")
                .stream()
                .filter(x -> x != null)
                .toList();
        System.out.println(data);
    }

    public static void firstElementStartingWithA() {
        List<String> names = List.of("Bob", "Alice", "Andrew", "Charlie")
                .stream()
                .filter(x -> x.startsWith("A"))
                .toList();
        System.out.println(names);
    }

    public static void squareAndSorted() {
        List<Integer> numbers = List.of(3, 1, 4, 2)
                .stream()
                .map(x -> x * x)
                .sorted()
                .toList();
        System.out.println(numbers);
    }

    public static void sumOfAllEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(x -> x % 2 == 0).toList();
        int sum = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(sum);

    }

    public static void convertingMap() {
        List<String> words = List.of("apple", "banana", "kiwi");
        Map<String, Integer> result = words.stream()
                .collect(Collectors.toMap(x -> x, x -> x.length()));
        System.out.println(result);
    }

    public static void findMaxNum() {
        List<Integer> numbers = List.of(10, 50, 30);
        int maxNumber = numbers.stream()
                .max((a, b) -> a.compareTo(b))
                .orElseThrow();
        System.out.println(maxNumber);

    }

    public static void groupsStringsByLength(){
        List<String> words = List.of("a","bb","ccc","dd");

    }
}
