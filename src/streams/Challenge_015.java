package streams;

import java.util.Arrays;
import java.util.List;

public class Challenge_015 {
    public static void main(String[] args) {
        //Check if all elements are positive numbers...
        List<Integer> numbers = Arrays.asList(3,1,6,-2,30,7,16);
        boolean result = numbers.stream().allMatch(n -> n>0);
        System.out.println("The list contains positive numbers or not  : "+result);

    }
}
