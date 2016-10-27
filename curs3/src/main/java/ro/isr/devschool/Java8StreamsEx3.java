package ro.isr.devschool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created by Mucefix on 27/10/16.
 */
public class Java8StreamsEx3 {

    //Get oldest person from the collection
    //Get all the oldest Persons
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person robert = new Person("Robert", 42);
        List<Person> collection = asList(sara, eva, viktor, robert);

        Person oldestPerson = collection.stream().max(Comparator.comparing(e -> e.getAge())).get();
        System.out.println(oldestPerson);

        List<Person> oldestPersons = collection.stream()
                .filter( p ->  p.getAge() == collection.stream().map(a -> a.getAge()).max(Comparator.naturalOrder()).get() )
                .collect(Collectors.toList());
        System.out.println("Oldest Persons");
        oldestPersons.forEach(System.out::println);
    }

    @AllArgsConstructor
    @Getter @Setter
    @ToString
    static class Person{
        String name;
        int age;

    }
}
