import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //print all emails (One employee has one email 1TO1)
        EmployeeData.readAll()
                .map(Employee::getEmpName)
                .forEach(System.out::println);

        //print all phoneNumbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        EmployeeData.readAll().flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("******************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }


}
