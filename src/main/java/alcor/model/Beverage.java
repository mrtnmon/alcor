package alcor.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Builder
@Document
public class Beverage {
    @Id
    private String id;

    private double alcoholPercentage;
    private int mililiter;

    @Indexed(unique = true)
    private String name;
    private Category category;
}
