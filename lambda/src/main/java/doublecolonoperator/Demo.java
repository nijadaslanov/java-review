package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        // Reference to static method
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(5, 5);

        Calculate s2 = Calculator::findSum;
        s2.calculate(5, 5);


        // Reference to instance method
        Calculate m1 = (x, y) -> new Calculator().findMultiply(x, y);
        m1.calculate(5, 5);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(8, 9);


        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("Developer", 5));

        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 3));

        Consumer<Integer> display = System.out::println;
        display.accept(5);


    }
}
