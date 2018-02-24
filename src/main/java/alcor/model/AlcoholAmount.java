package alcor.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlcoholAmount {
    private double grams;

    @Override
    public String toString() {
        return grams + "/L";
    }
}
