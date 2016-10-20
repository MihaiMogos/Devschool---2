package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by user on 10/20/2016.
 */

@Getter @Setter
@AllArgsConstructor
public abstract class Piece {

    private Square placeAt;
    private PieceColor pieceColor;
    private boolean moved;



    //method without body -> to be implemented
    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();


}
