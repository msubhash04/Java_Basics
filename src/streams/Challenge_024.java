package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge_024 {
    public static void main(String[] args) {
        //Count the occurance of each elements in the list...
        List<String> words = Arrays.asList("Apple","Banana","Orange","Apple","Banana","Apple");
        Map<String, Long> result = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println("The occurance of each elements as : "+result);
        //By using the lambda expressions.
        result.forEach(
                (k,v)->{
                    System.out.println("The key "+k+"   and the value   "+v);
                }
        );
    }

}
