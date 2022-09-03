import java.util.Comparator;
import java.util.stream.Collectors;

public class TransactionTest {
    public static void main(String[] args) {

        // 1- Find all transactions in 2011 and sort by value

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);


        //2-What are all unique cities where the traders work?

        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);


        // 3-Find all traders from Cambridge and sort them by name
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);


        //4- Return a String of all traders names sorted alphabetically

        System.out.println("*******Task4***********");

        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce(" ", (name1, name2) -> name1 + " " + name2);
        System.out.println(result);


    }
}
