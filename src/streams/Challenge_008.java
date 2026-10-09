package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Challenge_008 {
    public static void main(String[] args) {
        //Find the Maximum number from the list...
        List<Integer> numbers = Arrays.asList(2,14,5,18,66,3);
//        Integer maxNum = numbers.stream().reduce(0,(a,b)->Integer.max(a,b));
//        Integer maxNum = numbers.stream().reduce(0, Integer::max);
//        System.out.println("The maximum number from the List is : "+maxNum);
        Optional<Integer> maxNum = numbers.stream().reduce(Integer::max);
        System.out.println("The maximum number from the List is : "+maxNum.get());
        Optional<Integer> first = numbers.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(first);
    }
}
