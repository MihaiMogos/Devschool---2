package ro.isr.devschool.chess;

import com.sun.xml.internal.bind.v2.TODO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by nilatac on 10/20/2016.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Piece {
    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    //// TODO: 10/20/2016
    //// READ FAVOR COMPOSITION OVER INHERITANCE


    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();

}
