import lombok.AllArgsConstructor;
import ro.isr.deveschool.chess.Square;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Mucefix on 16/10/16.
 */
public class HelloWorld {

    static {
        /*
          blocul acesta se va executa o singura data in momentul in care
          clasa este incarcata de catre classloader
         */
    }

    public static void main(String[] args) {
        System.out.printf("Hello World !");

        Square square = new Square(2,3);

        List<Person> persons = Arrays.asList(new Person("Mihai", 28), new Person("Elena", 22), new Person("Andreea", 26), new Person("Ramona", 23));
        System.out.println(persons.stream().mapToInt(s-> s.age).filter(s -> s < 25).average());
        System.out.println(persons.stream().map(s-> s.age).filter(s -> s < 25).min(Comparator.naturalOrder()));
    }

    @AllArgsConstructor
    static class Person{
        String name;
        int age;
    }
}
