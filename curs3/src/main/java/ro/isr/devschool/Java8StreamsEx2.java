package ro.isr.devschool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mucefix on 27/10/16.
 */
public class Java8StreamsEx2 {

    //Filter collection so that only elements with less than 4 characters are returned.
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");

        List<String> namesLessThan4 = collection.stream().filter(e -> e.length() < 4).collect(Collectors.toList());
        namesLessThan4.forEach(System.out::println);
    }

}
