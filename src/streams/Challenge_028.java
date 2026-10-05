package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Challenge_028 {
    public static void main(String[] args) {
        //Find the department with the heighest average salary...
        List<Emploed> emploedList = Arrays.asList(
                new Emploed(101,"Rajesh","HR",15000),
                new Emploed(102,"Rukmini","IT",25000),
                new Emploed(103,"Vasanta","HR",18000),
                new Emploed(104,"Suja","IT",50000),
                new Emploed(105,"Santu","Finance",36000),
                new Emploed(106,"Paul","IT",40000)
        );

//        Map<String, Double> result = emploedList.stream().collect(Collectors.groupingBy(Emploed::getDepartment, Collectors.averagingDouble(Emploed::getSalary)));
//        Map.Entry<String, Double> res = result.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
//        System.out.println(res);
        Map.Entry<String, Double> result = emploedList.stream()
                .collect(Collectors.groupingBy(
                        Emploed::getDepartment,
                        Collectors.averagingDouble(Emploed::getSalary)
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Department with highest average salary: " + result.getKey());
        System.out.println("Average Salary: " + result.getValue());
    }
}
