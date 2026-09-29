package streams;

import java.util.Arrays;
import java.util.List;

public class Challenge_007 {
    public static void main(String[] args) {
        //Find the sum of even numbers in list...
        List<Integer> numbers = Arrays.asList(1,4,8,5,14);
        Integer sumEven = numbers.stream().filter(n -> n%2==0).reduce(0,(a,b) -> a+b);
        System.out.println("The sum of even numbers in list is : "+sumEven);
    }
}
