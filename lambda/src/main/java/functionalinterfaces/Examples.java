package functionalinterfaces;

import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };

        // System.out.println(lesserThan.test(18));

        Predicate<Integer> lesserThan = a -> a < 18; // defines implementation of test() method belongs to interface
        System.out.println(lesserThan.test(3));

    }


}
