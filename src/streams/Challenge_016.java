package streams;

import java.util.Arrays;
import java.util.List;

public class Challenge_016 {
    public static void main(String[] args) {
        //Check if any number is divisible by 3..
        List<Integer> numbers = Arrays.asList(2,4,17,19,11);
        boolean result = numbers.stream().anyMatch(n -> n%3==0);
        System.out.println("In the list is any number is divisible by 3 or not :  "+result);
    }
}
