import java.time.Duration;
import java.time.LocalDate;

public class DaysToXmas {

    public long daysToXmas (int year) {
       return Duration.between(LocalDate.now().atStartOfDay(),LocalDate.of(year,12,25).atStartOfDay()).toDays();
    }


}
