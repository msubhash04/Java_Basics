package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_012 {
    public static void main(String[] args) {
        //Sort a list of integers in ascending and descending order using the streams...
        List<Integer> numbers = Arrays.asList(4,1,7,3,8,5);
        List<Integer> result = numbers.stream()
                .sorted()
                .toList();
        System.out.println("The sorted ASCENDING list is  :  "+result);
        List<Integer> result1 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("The sorted DESCENDING list is :  "+result1);
    }
}
