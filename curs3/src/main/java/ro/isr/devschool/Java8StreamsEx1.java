package ro.isr.devschool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihai MOGOS on 27/10/16.
 */
public class Java8StreamsEx1 {

    //Convert elements of a collection to upper case.
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");

        List<String> stringsToUpperCase =  collection.stream().map( String::toUpperCase ).collect(Collectors.toList());
        stringsToUpperCase.forEach(System.out::println);

    }
}
