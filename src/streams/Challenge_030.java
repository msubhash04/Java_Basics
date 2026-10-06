package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge_030 {
    public static void main(String[] args) {
        //Find the frequency of a each letter in a word 'swiss'...
        String word = "swiss";

//        Map<Character, Long> result = word.chars().mapToObj(c->(char) c)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
//        System.out.println(result);     //{s=3, w=1, i=1}

        //Display the letters from a given word which are not repeated
        Map<Character, Long> result = word.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(result);         //{w=1, i=1}
    }
}
