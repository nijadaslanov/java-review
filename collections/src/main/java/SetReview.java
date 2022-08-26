import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        // 1. create a set
        Set<Student> mySet = new HashSet<>();

        // 2. add element
        mySet.add(new Student(7, "Joe"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Jane"));
        mySet.add(new Student(9, "Jane"));
        System.out.println(mySet);
        System.out.println(firstRepeatingChar("Java Developer") + " is first repeating");

    }


    public static Character firstRepeatingChar(String str) {

        Set<Character> chars = new HashSet<>();
        for (Character ch : str.toCharArray())
            if (!chars.add(ch)) return ch;
            return null;
        }


    }


