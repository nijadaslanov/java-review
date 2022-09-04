import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        // toCollection(Supplier) : is used to create a collection using collector

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("result = " + result);

        System.out.println("********************");

        Set<Integer> set = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);

        System.out.println("****toList*****");

        List<Integer> list2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("list2 = " + list2);

        System.out.println("****toSet*****");

        Set<Integer> set2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("set2 = " + set2);


        //toMap(Function,Function): returns Collector interface that gathers the input data into a new map

        Map<String, Integer> map = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println("map = " + map);


        // counting() : returns a Collector that counts the number of the elements


        Long count = numbers.stream()
                .filter(p -> p % 2 == 0)
                .collect(Collectors.counting());

        System.out.println("count = " + count);


        // summingInt(ToIntFunction) : returns a Collector that produces some  integer-valued function

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);


        // averagingInt(ToIntFunction)

        double d = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("d = " + d);

        // joining() : is used to join various elements of a character of string array into a single string object

        List<String> lists = Arrays.asList("Java", "Python", "Typescript");
        String str = lists.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        //partitioningBy() : is used to partition a stream of objects or set of elements based on a given predicate

        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegeterian));
        System.out.println(veggieDish);

    }


}
