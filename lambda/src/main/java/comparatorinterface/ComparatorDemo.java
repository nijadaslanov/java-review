package comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1.3.4.5", "2.3.4.5", "4.4.5.6");

        //Ascending sort
        Collections.sort(list);
        System.out.println(list);
        //Descending order
        // Collections.sort(list, new MyComparator());
        System.out.println(list);


        //compareTo  descending
        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);

        //ascending
        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list.get(0));


        List<Apple> myInventory = Arrays.asList(

                new Apple(89, Color.GREEN),
                new Apple(155, Color.RED),
                new Apple(120, Color.GREEN)
        );

        Comparator<Apple> sortApple = Comparator.comparing(Apple::getWeight);
        myInventory.sort(sortApple);
        System.out.println(myInventory);

    }
}
