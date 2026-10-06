package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge_031 {
    public static void main(String[] args) {
        //Find the most common first letter among all employee names...
        List<Emploed> emploedList = Arrays.asList(
                new Emploed(101,"Raajesh","HR",15000),
                new Emploed(102,"Rukmini","IT",25000),
                new Emploed(103,"Vasanta","HR",18000),
                new Emploed(104,"Suja","IT",50000),
                new Emploed(105,"Santu","Finance",36000),
                new Emploed(106,"Paul","IT",40000),
                new Emploed(107,"Sangu","Finance",36000),
                new Emploed(108,"Sham","Finance",36000),
                new Emploed(109,"Rakesh","IT",36000),
                new Emploed(110,"Prakash","Finance",36000)
        );

//        Map<Character, Long> characterLongMap = emploedList.stream()
//                .map(c -> c.getName().charAt(0))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(characterLongMap);   //{P=2, R=3, S=4, V=1}

//        Optional<Map.Entry<Character, Long>> characterLongMap = emploedList.stream()
//                .map(c -> c.getName().charAt(0))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                        .entrySet().stream().max(Map.Entry.comparingByValue());
//        System.out.println(characterLongMap.get());   //S=4

//        Stream<Character> list = emploedList.stream().map(c -> c.getName())
//                .toList().stream().findFirst()
//                .stream().toList()
//                .stream().flatMap(n -> n.chars().mapToObj(c -> (char) c));
//        System.out.println(list.collect(Collectors.toSet()));   //[a, R, s, e, h, j]

        Map<Character, Long> list = emploedList.stream().map(c -> c.getName())
                .toList().stream().findFirst()
                .stream().toList()
                .stream().flatMap(n -> n.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(list);             //{a=1, R=1, s=1, e=1, h=1, j=1}

    }
}
