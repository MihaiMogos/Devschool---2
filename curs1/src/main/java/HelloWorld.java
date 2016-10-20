import ro.isr.devschool.chess.Square;

import java.util.Collections;

/**
 * Created by Mucefix on 16/10/16.
 */

public class HelloWorld {

    static {
        /*
        *blocul acesta se va executa o singura data in momentul in care clasa
        *clasa este incarcata de catre classloader
         */
    }

    public static void main(String[] args) {
        System.out.printf("Hello World !");

        Square s = new Square(2,3);
        s.getRow();
        //System.out.println(s);


    }
}

// read about maven
// get used to Intellij
// checkout chess diagram from resource
// oop diagram
