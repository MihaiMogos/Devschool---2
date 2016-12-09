package ro.isr.devschool.designpatterns.creational.builder;

/**
 * Created by Mihai MOGOS on 03/11/16.
 */
public class BuilderDemo {

    public static void main(String[] args) {

        Student radu = Student
                        .builder()
                        .nume("Radu")
                        .nrMatricol("XXXYYY")
                        .varsta(20)
                        .build();

        System.out.println(radu);

    }

}
