package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by Mucefix on 03/11/16.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Singleton singletonNew = Singleton.getInstance();

        System.out.println("Singleton address: "+ singleton);

        System.out.println("SingletonNew address: "+ singletonNew);
    }

}
