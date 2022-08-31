import java.util.Optional;

public class Matching {

    //All match

    public static void main(String[] args) {
        boolean isHealthy = DishData.getAll()
                .stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);


        //Any match

        if (DishData.getAll()
                .stream()
                .anyMatch(Dish::isVegeterian)) ;
        System.out.println("Vegetarian friendly");


        // None Match

        System.out.println("****************");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() > 1000);
        System.out.println(isHealthy2);

        // Find Any

        Optional<Dish> optional = DishData.getAll()
                .stream()
                .filter(Dish::isVegeterian)
                .findAny();

        System.out.println(optional);

       // Find

        Optional<Dish> optional2 = DishData.getAll()
                .stream()
                .filter(Dish::isVegeterian)
                .findFirst();
        System.out.println("optional2 = " + optional2);


    }


}
