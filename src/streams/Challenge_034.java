package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge_034 {
    public static void main(String[] args) {
        //Find the top 3 most frequent words in a paragraph...
        String paragraph = "Java is greate. Java is object oriented. Java streams are powerful?";

        Map<String, Long> stream = Arrays.stream(
                paragraph.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Map.Entry<String, Long>> list = stream.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).toList();

        System.out.println(list);           //[java=3, is=2, greate=1]
    }
}
