package comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);

        //Ascending sort
        Collections.sort(list);
        System.out.println(list);
        //Descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);


        //compareTo  descending
        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);

        //ascending
        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);


    }
}
