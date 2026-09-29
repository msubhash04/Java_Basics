package streams;

import java.util.Arrays;
import java.util.List;

public class Challenge_005 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,7,3,9,34,11,2);
        long result = numbers.stream().filter(n -> n>5).count();
        System.out.println("Greater than 5 elements inside the List is : "+result);
    }
}
