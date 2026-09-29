package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge_004 {
    public static void main(String[] args) {
        //Find a first number which is greater than 10 from list;
        List<Integer> numbers = Arrays.asList(1,3,13,28,6,54,17,2);
        Optional<Integer> result = numbers.stream()
                .filter(n -> n>10)
                .sorted()
                .findFirst();
        System.out.println("The first number greater then 10 is : "+result.get());
    }
}
