package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 10/11/16.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for( Iterator it = nameRepository.getIterator(); it.hasNext(); ){
            System.out.println("Name is: "+ it.next());
        }

    }
}
