import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Language {
    private String languageName;
    private Integer languageId;
}
