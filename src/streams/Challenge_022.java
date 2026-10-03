package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge_022 {
    public static void main(String[] args) {
        //Partition numbers in even and odd list...
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n -> n%2==0));
        System.out.println("The even List :  "+result.get(true));
        System.out.println("The odd List :  "+result.get(false));
    }
}
