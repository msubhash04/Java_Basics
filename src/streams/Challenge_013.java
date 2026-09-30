package streams;

import java.util.Arrays;
import java.util.List;

public class Challenge_013 {
    public static void main(String[] args) {
        //Count how many Strings starts with a specific letter (Like 'A').
        List<String> numbers = Arrays.asList("Apple","Orange","Avacado","Anjeer","Mango");
//        List<String> result = numbers.stream().filter(fr -> fr.startsWith("A")).toList();
//        System.out.println("The List of the fruits starts with A is :  "+result);

        long cnt = numbers.stream().filter(fr -> fr.startsWith("A")).count();
        System.out.println("The Number of fruits present in the list starting with the letter A is : "+cnt);

    }
}
