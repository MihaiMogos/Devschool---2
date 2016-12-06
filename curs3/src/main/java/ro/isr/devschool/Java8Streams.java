package ro.isr.devschool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Mihai MOGOS on 27/10/16.
 */
public class Java8Streams {

    public static void main(String[] args) {
        //list of persons - age average of Persons above 20
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(30, "Alin"),
                new Person(17, "Vali"),
                new Person(28, "Alma"),
                new Person(15, "Sebastian"),
                new Person(35, "Ionut"));

        int sumOfAge = 0;
        int numberOfPersons = 0;
        for( Person persoana : persons ){
            if( persoana.getAge() > 20 ){
                numberOfPersons ++;
                sumOfAge += persoana.getAge();
            }
        }
        double averageAge = (double)sumOfAge / numberOfPersons;
        System.out.println("Media varstei este: "+averageAge);

        Stream<Person> streamPersons = persons.stream();
        OptionalDouble averageOptional = streamPersons
                                            .mapToInt(person -> person.getAge())
                                            .filter(age -> age > 20)
                                            .average();
        /*streamPersons
                .mapToInt(person -> person.getAge())
                .filter(age -> age > 20)
                .average();*/
        if( averageOptional.isPresent() ){
            System.out.println("Media varstei cu streams: "+averageOptional.getAsDouble());
        }
        List<Integer> personsAgesAbove20= persons.stream()
                                            .map(person -> person.getAge())
                                            .filter(age -> age > 20)
                                            .collect(Collectors.toList());
        personsAgesAbove20.forEach(System.out::println);
    }


    @AllArgsConstructor
    @Getter @Setter
    static class Person{
        int age;
        String name;
    }
}
