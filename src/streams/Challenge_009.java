package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge_009 {
    public static void main(String[] args) {
        //Sum of Square of Even numbers in list...
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        Integer result = numbers.stream().filter(n -> n%2==0).map(n -> n*n).reduce(0,(a,b)->a+b);
//        System.out.println("The Sum of Square of Even numbers is : "+result);

//        Integer result = numbers.stream().filter(n -> n%2==0).map(n -> n*n).reduce(0, Integer::sum);
//        System.out.println("The Sum of Square of Even numbers is : "+result);

        Optional<Integer> result = numbers.stream().filter(n -> n%2==0).map(n -> n*n).reduce(Integer::sum);
        System.out.println("The Sum of Square of Even numbers is : "+result.get());

    }
}
