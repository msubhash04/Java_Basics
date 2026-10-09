package streams;

import java.util.Arrays;
import java.util.List;

public class Challenge_017 {
    public static void main(String[] args) {
        //Flatten the list of list...
        List<List<Integer>> listOfLists= Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8)
        );

        List<Integer> listEle = listOfLists.stream().flatMap(List::stream).toList();
        System.out.println("The list elements after Flattened  :  "+listEle);
    }
}
