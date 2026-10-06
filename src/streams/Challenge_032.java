package streams;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Challenge_032 {
    public static void main(String[] args) {
        //Given a list of integers compute the average of every 3 elements sliding window...
        List<Integer> numbers = Arrays.asList(4,8,15,16,23,42);
        int window = 4;
//        List<Integer> list = IntStream.range(0, numbers.size() - (window-1))
//                .mapToObj(i ->(numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2)) / window)
//                .toList();
//        System.out.println(list);  //[9, 13, 18, 27]

        List<List<Integer>> list1 = IntStream.range(0, numbers.size() - (window-1))
                .mapToObj(i->numbers.subList(i,i+window))
                .toList();
//        System.out.println(list);   //[[4, 8, 15], [8, 15, 16], [15, 16, 23], [16, 23, 42]]
        System.out.println(list1);     //int window = 4; ->  [[4, 8, 15, 16], [8, 15, 16, 23], [15, 16, 23, 42]]

        List<Double> list = IntStream.range(0, numbers.size() - (window-1))
                .mapToObj(i->numbers.subList(i,i+window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)
                ).toList();

        System.out.println(list);


    }
}
