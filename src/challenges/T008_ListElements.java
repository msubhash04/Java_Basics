package challenges;


import java.util.Arrays;
import java.util.List;

public class T008_ListElements {
    public static void main(String[] args) {
     /*  int[] arr= {1,2,3};
       List l = Arrays.asList(arr);     //In the l reference memory address will be stored.

        System.out.println(l);   //The memory address is displaying
//        l.set(1,5);
        arr[0] = 4;
        System.out.println(l);*/  //The memory address is displaying
        //l.set(2,6);
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1
                        at java.base/java.util.Arrays$ArrayList.set(Arrays.java:4229)
                        at challenges.T008_ListElements.main(T008_ListElements.java:16)    */

        String[]  arr = {"A","B","C"};
        List l = Arrays.asList(arr);
        System.out.println(l);
        arr[1] = "D";
        System.out.println(l);
        l.set(2,"H");
        System.out.println(l);
    }
}
