package functionalinterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        // *********Predicate********

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };

        // System.out.println(lesserThan.test(18));

        Predicate<Integer> lesserThan = a -> a < 18; // defines implementation of test() method belongs to interface
        System.out.println(lesserThan.test(3));


        //*********Consumer************

        Consumer<Integer> th = i -> System.out.println(i);
        th.accept(50);


        //**********BiConsumer****************

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(50, 70);

        //*********FUNCTION***************

        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Nijad"));


        //**********Supplier************

        Supplier<Double> randomValue = () -> Math.random();
        Double db = randomValue.get();
        System.out.println(db);


    }


}
