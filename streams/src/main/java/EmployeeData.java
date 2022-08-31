import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2036082334", "2036078945")),
                new Employee(100, "Ozzy", "ozzy@cydeo.com", Arrays.asList("5676082334", "3456078945")),
                new Employee(100, "Peter", "peter@cydeo.com", Arrays.asList("3426082334", "5136078945"))

        );
    };


}
