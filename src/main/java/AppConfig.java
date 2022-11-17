import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "daysToXmas")
    public DaysToXmas daysToXmas() {
        return new DaysToXmas();
    }

    @Bean (name = "searchPrime")
    public SearchPrime searchPrimes() {
        return new SearchPrime();
    }

}
