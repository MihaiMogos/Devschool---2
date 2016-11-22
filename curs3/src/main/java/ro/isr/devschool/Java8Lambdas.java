package ro.isr.devschool;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Mihai MOGOS on 27/10/16.
 */
public class Java8Lambdas {
    public static void main(String[] args){

        /*final FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };*/
        //WELCOME TO THE LAMBDA SIDE !!!
        /*final FilenameFilter filter = (File dir, String name) -> {
            return name.toLowerCase().endsWith(".txt");
        };*/
        /*final FilenameFilter filter = (dir, name) -> {
            return name.toLowerCase().endsWith(".txt");
        };*/

        final FilenameFilter filter =
                (dir, name) -> !dir.isDirectory() && name.toLowerCase().endsWith(".txt");

        File homeDir = new File(System.getProperty("user.home"));
        String[] files = homeDir.list(filter);
        for(String file : files){
            System.out.println(file);
        }
        //System.out.println(homeDir.list(filter));

        List<String> names = new ArrayList<>();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

        Supplier<String> i  = ()-> "java2s.com";

        System.out.println(i.get());

        ///Predicate Chain
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s-> s.length() > 10;
        Predicate<String> p3 = p1.and(p2);


        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        List<String> result = new ArrayList<>();
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = result::add;
        strings.forEach(c1.andThen(c2));

        result.forEach(c1);

    }

}
