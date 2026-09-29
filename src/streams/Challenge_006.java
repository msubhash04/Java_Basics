package streams;

import java.util.Arrays;
import java.util.List;

public class Challenge_006 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        Integer result = numbers.stream().reduce(0,(a,b) -> a+b);
//        System.out.println("The sum of elements present in the List : "+result);
        Integer result = numbers.stream().reduce(1,(a,b) -> a*b);
        System.out.println("The Product of elements present in the List : "+result);

    }
}
