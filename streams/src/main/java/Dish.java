import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Function;

@Data
@AllArgsConstructor
public class Dish  {


    private String name;
    private boolean vegeterian;
    private int calories;
    private Type type;








}
