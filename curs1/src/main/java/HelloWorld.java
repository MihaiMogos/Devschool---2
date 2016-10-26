/**
 * Created by Mucefix on 16/10/16.
 */
public class HelloWorld {

    static {
        /*
          blocul acesta se va executa o singura data in momentul in care
          clasa este incarcata de catre classloader
         */
    }

    public static void main(String[] args) {
        System.out.printf("Hello World !");

        //Square s = new Square(2,2);
    }
}
