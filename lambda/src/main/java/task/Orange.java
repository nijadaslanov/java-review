package task;

import lombok.*;

// @Builder generates an @AllArgsConstructor unless there is another @XConstructor
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
@Data
@Builder
public class Orange {

    private int weight;
    private Color color;
}
