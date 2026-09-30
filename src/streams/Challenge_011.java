package streams;

import com.mysql.cj.conf.IntegerProperty;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Challenge_011 {
    public static void main(String[] args) {
        //Find the average of all numbers in a list...
        List<Integer> numbers = Arrays.asList(3,45,2,8,12,11,3);
//        OptionalDouble result = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .average();
//        System.out.println("The average of the numbers in a list is :   "+result.getAsDouble());

        double result = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("The average of the numbers in a list is :   "+result);

    }
}
