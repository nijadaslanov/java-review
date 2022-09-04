import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionTest {
    public static void main(String[] args) {

        // 1- Find all transactions in 2011 and sort by value

        List<Transaction> toSort = new ArrayList<>();
        for (Transaction transaction1 : TransactionData.getAll()) {
            if (transaction1.getYear() == 2011) {
                toSort.add(transaction1);
            }
        }
        toSort.sort(Comparator.comparing(Transaction::getValue));
        for (Transaction transaction1 : toSort) {
            System.out.println(transaction1);
        }


        //2- What are all unique cities where the traders work?

        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);


        //3- Find all traders from Cambridge and sort them by name

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);


        //4 - Return a String of all traders names sorted alphabetically

        System.out.println("*******Task4***********");

        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce(" ", (name1, name2) -> name1 + " " + name2);
        System.out.println(result);

        //5- Are any traders based in Milan

        System.out.println("************");
        boolean milanBase = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBase);
        System.out.println("*************************");

        //6- print the values of all transactions from traders living in Cambridge

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        //7- What is the highest value of all the transactions

        Optional<Integer> opt = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(opt.get());

        //8- Find transaction with the smallest value

        Optional<Transaction> smValue = TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);

        System.out.println("smValue = " + smValue);

    }
}
