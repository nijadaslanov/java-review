import java.util.*;

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


        //For Loop with get(index)
        for (int i = 0; i < students.size(); i++) System.out.println("Student " + students.get(i).id);
        System.out.println("_________________________");

        // 2. Iterator
        //Forward Iteration
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Backwards Iteration
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());

        }

        // forEach Loop
        for (Student student : students) System.out.println(student);


        // 4. Lambda
        System.out.println("Lambdaaaaaa");
        students.forEach(student -> System.out.println(student));


        // Sorting Elements in List
        System.out.println("Descending sort ..............");
        Collections.sort(students, new sortIdDesc());
        System.out.println(students);


    }


    static class sortIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }






}
