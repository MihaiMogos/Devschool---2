import ro.isr.devschool.chess.Square;

/**
 * Created by Mucefix on 16/10/16.
 */
public class HelloWorld {

    static {
        // de exemplu la o conexiune de baza de date, doar o data la inceput
        //blocul acesta se va rula o singura data, in momentul in care clasa este incarcata de catre ClassLoader
    }

    public static void main(String[] args) {


        Square square=new Square(1,2);
        square.getColumn();
        System.out.printf("Hello World !");




    }
}
