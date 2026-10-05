package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge_029 {
    public static void main(String[] args) {
        //Find the most frequent character in the string...
        String str = "banana";
        Map<Character,Long> result = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);  //{a=3, b=1, n=2}
//        List<Character> ch = str.chars().mapToObj(c->(char) c).toList();
//        System.out.println(ch);    //[b, a, n, a, n, a]
        Map.Entry<Character, Long> rst =  result.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(rst);//a=3


    }
}
