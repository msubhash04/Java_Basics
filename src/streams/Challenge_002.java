package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_002 {
    public static void main(String[] args) {
        //Convert the even numbers in the list to their squares...
        List<Integer> numbers = Arrays.asList(1,3,4,7,8);
//        List<Integer> resultlist = numbers.stream().map(n -> n*n).collect(Collectors.toList());
        List<Integer> resultlist = numbers.stream().map(n -> n*n).toList();
        System.out.println("The elements inside the list is squared:  ");
        System.out.println(resultlist);
    }
}
