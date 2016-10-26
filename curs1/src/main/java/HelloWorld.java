import ro.isr.devschool.chess.Square;

/**
 * Created by Mucefix on 16/10/16.
 */
public class HelloWorld {
    static {
        /*
        blocul se va executa o singura data in momentul
        in care clasa este incarcata de catre classloader
        ex: conexiune la bd
         */
    }
    public static void main(String[] args) {
        System.out.printf("Hello World !");
        Square square = new Square(2,3);
    }
}
