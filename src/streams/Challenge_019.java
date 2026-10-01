package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Challenge_019 {
    public static void main(String[] args) {
        //Find the second heighest number in a list using streams...
        List<Integer> numbers = Arrays.asList(2,16,37,3,70,5);
        Optional<Integer> result = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("The second heighest number of the list  :  "+result.get());
    }
}
