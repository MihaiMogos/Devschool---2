import ro.isr.devschool.chess.Square;

/**
 * Created by Mucefix on 16/10/16.
 */
public class HelloWorld {

    static {
            /*
                Blocul acesta se va executa o singura data,
                in momentul in care clasa e incarcata de catre,
                Class Loader, inaintea constructorului clasei.
             */
    }

    public static void main(String[] args) {


        System.out.printf("Hello World !\n");

        Square square = new Square(4, 3);

    }
}
