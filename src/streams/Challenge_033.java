package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge_033 {
    public static void main(String[] args) {
        //Find the longest word in a sentence ignoring case and punctuation.

        String sentence = "The quick, brown fox jumped over the lazy dog!";
        String result = Arrays.stream(
                sentence.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ")
        ).max(Comparator.comparing(String::length)).orElse("");
        System.out.println("The longest word in the sentence is :  "+result);

    }
}
