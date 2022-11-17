import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        DaysToXmas days = (DaysToXmas) ctx.getBean("daysToXmas");
        long c = days.daysToXmas(2022);
        System.out.println(c);

        SearchPrime searchPrime = (SearchPrime) ctx.getBean("searchPrime");
        List<Integer> testList = searchPrime.getFirstPrimes(1000);
        System.out.println(Arrays.toString(testList.toArray()));
        System.out.println("Total primes: " +testList.size());



    }




}
