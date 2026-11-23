package streams;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        //Filter Even numbers from the list...
//        List<Integer> result = numbers.stream().filter(n->n%2==0).toList();
//        System.out.println("The list of elements after filter : "+result);
        //Convert the every numbers in the list to their squares...
//        List<Integer> result = numbers.stream().map(n->n*n).toList();
//        System.out.println("The list of elements after the doubled : "+result);
        //Square even numbers from the list...
//        List<Integer> resultList = numbers.stream().filter(n -> n % 2 == 0)
//                .map(n -> n * n)
//                .toList();
//        System.out.println("The list of even square as follows : "+resultList);
        //Find a first number which is greater than 10 from list;
        // numbers = Arrays.asList(1,3,13,28,6,54,17,2,12);
//         Optional<Integer> result = numbers.stream().filter(n->n>10).sorted().findFirst();
//        System.out.println("The first element after the 10 in the given list : "+result.get());

        //Find the no of elements greater then the 5 inside the given list
//        long count = numbers.stream().filter(n -> n > 5).count();
//        System.out.println("The number of elements which are greater then 5 is :  "+count);

       //Find the sum of all the elements present in the given list.
//        Integer sumOfEle = numbers.stream().reduce(0, (c, d) -> c + d);
//        System.out.println("The sum of all the elements in the list is :  "+sumOfEle);

        //Find the product of all the elements present in the given list.
//        Integer prodOfEle = numbers.stream().reduce(1, (c, d) -> c * d);
//        System.out.println("The Product of all elements in the list is  :  "+prodOfEle);

        //Find the sum of even numbers in the list.
//        Integer sumOfEven = numbers.stream().filter(n -> n % 2 == 0).reduce(0, (e, f) -> e + f);
//        System.out.println("The sum of even numbers in the list is : "+sumOfEven);

        //Find the maximum number from the given list.
        //Integer maxNum = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        //Integer maxNum = numbers.stream().reduce(0, Integer::max);
//        Integer maxNum = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
//        Integer maxNum = numbers.stream().reduce(Integer::max).get();
        //System.out.println("The maximum number in the list is : "+maxNum);


        int[] arr = {1,2,3,4,5};

        //Using the streams...
        int[] reversedArray = IntStream.range(0, arr.length).map(i -> arr[arr.length - 1 - i]).toArray();
        System.out.println(Arrays.toString(reversedArray));


    }
}
