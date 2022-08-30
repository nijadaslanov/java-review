import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {


        //Creating Stream from array
        String[] languages = {"Java", "JS", "TS"};
        Stream<String> languageStream = Arrays.stream(languages);

        //Creating Stream from Collection
        List<String> languageList = Arrays.asList("Java", "DS", "Spring");
        Stream<String> languageStream2 = languageList.stream();


        List<Language> myLanguages = Arrays.asList(
                new Language("java", 100),
                new Language("DS", 101),
                new Language("Spring", 102),
                new Language("Microservices", 103)

        );

        Stream<Language> myLanguagesStream = myLanguages.stream();

        //Creating Stream from values
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);



    }


}
