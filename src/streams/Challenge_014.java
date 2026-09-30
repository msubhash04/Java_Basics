package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_014 {
    public static void main(String[] args) {
        //Join all string in a list into a single comma separated list..
        List<String> numbers = Arrays.asList("Apple","Orange","Avacado","Anjeer","Mango");
        //String result = numbers.stream().collect(Collectors.joining()); //AppleOrangeAvacadoAnjeerMango
        //String result = numbers.stream().collect(Collectors.joining(",")); //Apple,Orange,Avacado,Anjeer,Mango
        String result = numbers.stream().collect(Collectors.joining(",","[","]")); //[Apple,Orange,Avacado,Anjeer,Mango]
        System.out.println("The single string : "+result);
    }
}
