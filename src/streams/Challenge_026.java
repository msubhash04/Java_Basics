package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Challenge_026 {
    public static void main(String[] args) {
        //Find the first one who get heighest paid salary of each department...
        List<Emploed> emploedList = Arrays.asList(
                new Emploed(101,"Rajesh","HR",15000),
                new Emploed(102,"Rukmini","IT",25000),
                new Emploed(103,"Vasanta","HR",18000),
                new Emploed(104,"Suja","IT",50000),
                new Emploed(105,"Santu","Finance",36000)
        );

        Map<String, Optional<Emploed>> result = emploedList.stream().collect(Collectors.groupingBy(Emploed::getDepartment,Collectors.maxBy(Comparator.comparing(Emploed::getSalary))));
        //System.out.println("The result :  "+result);

        result.forEach((k,v) -> {
            System.out.println(k+"  -  "+v.stream().toList());
        });
    }
}
