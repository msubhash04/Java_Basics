package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge_020 {
    //Sort list of employees by salary...

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101,"Tarun",40000),
                new Employee(102,"Nabin",30000),
                new Employee(103,"Ali Naser",46000),
                new Employee(104,"Suneel",20400),
                new Employee(105,"Arun",28300),
                new Employee(106,"Monika",26000),
                new Employee(107,"Sai Tej",39000)
        );

//        List<Employee> result = empList.stream().sorted().toList();  //Exception
//        System.out.println("The sorted employee list  :  "+result);

        List<Employee> result = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println("The sorted employee list  :  "+result);
    }
}
