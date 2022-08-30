import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8);
        myList.forEach(System.out::println);


        System.out.println("**********************");

        //FILTER
        myList.stream()
                .filter(p -> p % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);


        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);


        //MAP
        System.out.println("MAP");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .map(i -> i * 3)
                .forEach(System.out::println);

        //print length of each
        System.out.println("********************");
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream() //(p->p.length)
                  .map(String::length).forEach(System.out::println);


    }
}
