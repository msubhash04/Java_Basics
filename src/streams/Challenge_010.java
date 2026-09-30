package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Challenge_010 {
    public static void main(String[] args) {
        //Find all distinct elements from a list(Remove duplicates).
        List<Integer> numbers = Arrays.asList(2,5,3,6,9,5,3,1);
        //Ans should be 2,5,3,6,9,1
//        Set<Integer> result = numbers.stream().collect(Collectors.toSet());
        List<Integer> result = numbers.stream().distinct().toList();
        System.out.println("The result set is :  "+result);
    }
}
