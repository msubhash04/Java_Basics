package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge_023 {
    public static void main(String[] args) {
        //Group a list of words by their length using the streams...
        List<String> words = Arrays.asList("Apple","Bat","Ball","Cat","Dog","Goat","Banana");
        Map<Integer, List<String>> result = words.stream().collect(Collectors.groupingBy(String::length));
        result.forEach((k, v) -> {
            System.out.println("Length : " + k + " -> Words : " + v);
        });
    }
}
