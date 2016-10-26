import ro.isr.devschool.chess.Square;

/**
 * Created by Mucefix on 16/10/16.
 */
public class HelloWorld {
    static{
        // bloc static
        // blocul acesta se va executa o singura data ->
        // momentul in care clasa este executata de catre class loader
    }
    public static void main(String[] args) {

        System.out.printf("Hello World !");
        Square mySquare = new Square(2,3);
        mySquare.getColumn();
    }
}

