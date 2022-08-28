import lombok.*;

import java.util.Objects;


//View -> Tool Windows -> structure
//
@Data
@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private int age;
    private String password;
    private String confirmPassword;

//    public Student() {
//    }
//
//    public Student(String firstName, String lastName, String userName, String email, int age, String password, String confirmPassword) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.userName = userName;
//        this.email = email;
//        this.age = age;
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getConfirmPassword() {
//        return confirmPassword;
//    }
//
//    public void setConfirmPassword(String confirmPassword) {
//        this.confirmPassword = confirmPassword;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", userName='" + userName + '\'' +
//                ", email='" + email + '\'' +
//                ", age=" + age +
//                ", password='" + password + '\'' +
//                ", confirmPassword='" + confirmPassword + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(userName, student.userName) && Objects.equals(email, student.email) && Objects.equals(password, student.password) && Objects.equals(confirmPassword, student.confirmPassword);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, userName, email, age, password, confirmPassword);
//    }
}
