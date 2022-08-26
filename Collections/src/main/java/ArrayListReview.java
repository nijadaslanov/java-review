import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {

        //Create Arraylist and a class
        List<Student> students = new ArrayList();

        // Add Elements to ArrayList
        students.add(new Student(1, "David"));
        students.add(new Student(2, "Said"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Josh"));

        System.out.println(students);


    }
}
