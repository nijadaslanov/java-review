import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                2, 4, 2, 10, 23
        );


        // empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent());

        // ifPresent()
        Optional<Integer> opt = numbers.stream().filter(x -> x > 100).findAny();
        opt.ifPresent(System.out::println);

        // get
        // System.out.println(opt.get());

        //orElse
        System.out.println(opt.orElse(0) + " zzz");


    }
}
