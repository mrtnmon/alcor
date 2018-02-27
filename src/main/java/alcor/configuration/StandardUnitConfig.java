package alcor.configuration;

import alcor.model.Beverage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class StandardUnitConfig {
    @Bean(name="standardUnit")
    public Beverage standardUnit(Environment env) {
        Beverage b = new Beverage();
        b.setAlcoholPercentage(5.0);
        b.setMililiter(250);
        return b;
    }
}
