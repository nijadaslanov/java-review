import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAll() {
        return Arrays.asList(

                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.FISH),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 400, Type.MEAT),
                new Dish("rice", true, 530, Type.MEAT),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("shrimp", false, 300, Type.FISH),
                new Dish("salmon", false, 400, Type.MEAT));


    }
}
