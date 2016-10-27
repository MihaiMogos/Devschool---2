import ro.isr.devschool.chess.Square;
import ro.isr.devschool.chess.enumeration.MoveDirection;
import ro.isr.devschool.chess.enumeration.PieceColor;
import ro.isr.devschool.chess.pieces.Pawn;
import ro.isr.devschool.chess.pieces.Piece;
import ro.isr.devschool.chess.pieces.Queen;

import java.util.Collection;

/**
 * Created by Mucefix on 16/10/16.
 */
public class HelloWorld {
    static{
        /*blocul acesta se va executa o singura data in momentul in care clasa este
        incarcata de catre classLoader
        - e apelat inainte de constructor
         */
    }
    public static void main(String[] args) {
        System.out.printf("Hello World !");

        Square square = new Square(2,3);
        Pawn p=new Pawn(PieceColor.BLACK, new Square(1, 3), false, false,
                new Queen(PieceColor.BLACK,new Square(1,4),false), MoveDirection.DOWN) ;




    }
}
