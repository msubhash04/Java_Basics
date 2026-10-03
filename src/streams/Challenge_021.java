package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Challenge_021 {
    public static void main(String[] args) {
        //Calculate the average age of list of a person objects using the streams.
        List<Person> personList = Arrays.asList(
                new Person("Suneel",26),
                new Person("Raghu",29),
                new Person("Ali Naser",31),
                new Person("Kumar",50),
                new Person("Karthik",48)
        );

        OptionalDouble avg = personList.stream().mapToInt(Person::getAge).average();
        System.out.println("The average age of the list of persons :  "+avg.getAsDouble());


    }
}
