package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {


    public static void main(String[] args) {


        List<User> userList = new ArrayList<>();
        userList.add(User.builder().firstName("Nijad").lastName("Eslanov").age(33).build());
        userList.add(User.builder().firstName("Ozzy").lastName("Eslanov").age(33).build());
        userList.add(User.builder().firstName("Jama").lastName("Aslanov").age(33).build());
        userList.add(User.builder().firstName("Eyup").lastName("Aslanov").age(33).build());

        //print all elements in the list
        printName(userList, p -> true);
        System.out.println("****************");

        //print all users that lastName starts with E
        printName(userList, user -> user.getLastName().startsWith("E"));


    }


    private static void printName(List<User> userList, Predicate<User> myUser) {
        for (User us : userList) {
            if (myUser.test(us)) {
                System.out.println(us.toString());
            }


        }
    }


}