import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apples> inventory = new ArrayList();
        inventory.add(new Apples(Color.GREEN, 300));
        inventory.add(new Apples(Color.RED, 100));
        inventory.add(new Apples(Color.GREEN, 200));
        inventory.add(new Apples(Color.RED, 400));


        List<Apples> heavyApples = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApples);

        List<Apples> greenColor = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenColor);


    }

    private static List<Apples> filterApples(List<Apples> inventory, ApplePredicate applePredicate) {

        List<Apples> result = new ArrayList<Apples>();

        for (Apples apples : inventory) {
            if (applePredicate.test(apples)) {
                result.add(apples);
            }
        }

        return result;
    }


}
