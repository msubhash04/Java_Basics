package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge_027 {
    public static void main(String[] args) {
        //Find all departments with more than 2 employees...

        List<Emploed> emploedList = Arrays.asList(
                new Emploed(101,"Rajesh","HR",15000),
                new Emploed(102,"Rukmini","IT",25000),
                new Emploed(103,"Vasanta","HR",18000),
                new Emploed(104,"Suja","IT",50000),
                new Emploed(105,"Santu","Finance",36000),
                new Emploed(106,"Paul","IT",40000)
        );

        Map<String, Long> result = emploedList.stream().collect(Collectors.groupingBy(Emploed::getDepartment, Collectors.counting()));
//        System.out.println(result);
        List<Map.Entry<String, Long>> list = result.entrySet().stream().filter(e -> e.getValue() > 1).toList();
        System.out.println(list);
    }
}
