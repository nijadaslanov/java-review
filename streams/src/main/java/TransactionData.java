import java.util.Arrays;
import java.util.List;

public class TransactionData {

    public static List<Transaction> getAll() {

        Trader raoul = new Trader("Raul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        return Arrays.asList(

                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2011, 400),
                new Transaction(alan, 2014, 800),
                new Transaction(mario, 2015, 800));





    }




}
