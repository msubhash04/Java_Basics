package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge_018 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("","","Hello","Subhash","");
//        List<String> result = strings.stream().filter(n -> !n.isEmpty()).toList();
//        System.out.println("The result string is  :  "+result);  //[Hello, Subhash]

        Optional<String> result = strings.stream().filter(n -> !n.isEmpty()).findFirst();
        System.out.println("The result string is  :  "+result.get());
    }
}
