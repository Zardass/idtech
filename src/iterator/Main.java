package iterator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        createStream();
        basicFilter();
        basicMap();
        basicSortedDistinct();
        limitSkip();
        findMatchTerminal();
        terminalAnyNoneAll();
        collectToListToSetJoining();
        collectGroupingByPartitionBy();
        reduceOperation();
    }

    public record User(int id,String name,int age,String city){

    }
    //Create Stream
    static void createStream() {
        List<Integer> list = List.of(1, 2, 3, 3);
        Stream<Integer> stream = list.stream();

        int[] arr = {1, 2, 3, 4};
        IntStream s = Arrays.stream(arr);

        System.out.println(list);
        System.out.println(stream.toList());
        System.out.println(s.boxed().toList());
    }


    //basic filter
    static void basicFilter() {
        System.out.println("\nBasic filter operations");
        List<Integer> evens = List.of(1, 2, 3, 4, 5, 6, 7).stream().filter(x -> x % 2 == 0).toList();
        System.out.println(evens);

    }

    static void basicMap() {
        System.out.println("\nbasic map");
        List<Integer> transformation = Stream.of("aaaa", "bbb", "c")
                .map(String::length).toList();
        System.out.println(transformation);
    }

    static void basicSortedDistinct() {
        System.out.println("\ndistinct and sorted operations");
        List<Integer> values = Stream.of(1, 1, 2, 5, 3, 17, 11, 3)
                .filter(x -> x > 5)
                .sorted()
                .distinct()
                .toList();
        System.out.println(values);
    }

    static void limitSkip() {
        System.out.println("\nLimit Skip operations");
        List<Integer> numbers = IntStream.rangeClosed(1, 50)
                .skip(10)
                .limit(67)
                .boxed()
                .toList();
        System.out.println(numbers);
    }

    static void findMatchTerminal() {
        System.out.println("\nfind count min max ");
        List<Integer> num = List.of(1, 2, 3, 56, 12, 11);
        int min = num.stream().min(Integer::compare).orElse(-1);
        int max = num.stream().max(Integer::compare).orElse(-1);
        long count = num.stream().count();
        System.out.println("count:" + count + " min:" + min + " max:" + max);
    }

    static void terminalAnyNoneAll() {
        System.out.println("\nany none all terminal operations");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        boolean anyPositive = numbers.stream().anyMatch(x -> x > 0);
        boolean allPositive = numbers.stream().allMatch(x -> x > 0);
        boolean noneNegative = numbers.stream().noneMatch(x -> x < 0);

        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();

        System.out.println("anyPositive:" + anyPositive + " allPositive:" + allPositive + " noneNegative: " + noneNegative);
        System.out.println("first element: " + first.orElse(null));
        System.out.println("any element of list: " + any.orElse(null));

    }

    static void collectToListToSetJoining(){
        System.out.println("\ncollectToListToSetJoining");
        List<String>  names = List.of("Zarda" , "Aysel", "Aytac","Lina");
        Set<String> set = names.stream().collect(Collectors.toSet());
        String joining = names.stream().collect(Collectors.joining(","));

        System.out.println("set: " + set);
        System.out.println("joining: " + joining);
    }

    //groupingBy and partitionBy
    static void collectGroupingByPartitionBy(){
        System.out.println("\ncollectGroupingByPartitionBy");
        List<User> users = demoUsers();
        Map<Integer,List<User>> byAging = users.stream()
                .collect(Collectors.groupingBy(user -> user.age));

        Map<Boolean,List<User>> adults = users.stream()
                .collect(Collectors.partitioningBy(user -> user.age() > 22));

        System.out.println("ByAge= " + byAging);
        System.out.println("PartitionBy= " + adults);

    }

    static List<User> demoUsers(){
        return List.of(
                new User(1,"Zarda",21,"Baku"),
                new User(2,"Aytac",23,"Baku"),
                new User(3,"Rahiba",25,"Turkey")
        );
    }

    static void reduceOperation(){
        System.out.println("\nreduce");

        List<Integer>  nums = List.of(1,2,3,4,5);
        int sum = nums.stream().reduce(1,(a,b) -> a+b);
        int fact = nums.stream().reduce(2,(a,b) -> a*b);

        System.out.println("sum= " + sum);
        System.out.println("factorial= " + fact);


    }

}
