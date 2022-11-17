import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchPrime {

    public List<Integer> getFirstPrimes (int upperBound) {
        List<Integer> result = new ArrayList<>();
        if (upperBound < 2) return result;
        result.add(2);
        if (upperBound == 2) return result;
        boolean isPrime = true;
        Timestamp start = new Timestamp(System.currentTimeMillis());

        for (int i = 3; i < upperBound; i = i+2) {
            isPrime = true;
            for (Integer num : result) {
                if ((i % num == 0) && (num < i>>1)) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.add(i);

            }
        }
        Timestamp end = new Timestamp(System.currentTimeMillis());
        long milliseconds = end.getTime() - start.getTime();
        System.out.println("Time to complete: " + milliseconds);
        return result;

    }

}
