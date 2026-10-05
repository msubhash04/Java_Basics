package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge_025 {
    public static void main(String[] args) {
        //Group employees by departent and calculate the average salary...
        List<Emploed> emploedList = Arrays.asList(
                new Emploed(101,"Rajesh","HR",15000),
                new Emploed(102,"Rukmini","IT",25000),
                new Emploed(103,"Vasanta","HR",18000),
                new Emploed(104,"Suja","IT",50000),
                new Emploed(105,"Santu","Finance",36000)
        );

        Map<String, Double> result = emploedList.stream().collect(Collectors.groupingBy(Emploed::getDepartment,Collectors.averagingDouble(Emploed::getSalary)));
//        System.out.println("The list of Employees "+result);

        //By using the lamda expressions...
        result.forEach((k,v) -> {
            System.out.println(k+"  -  "+v);
        });
    }
}
