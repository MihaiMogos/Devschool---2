package ro.isr.deveschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Mucefix on 20/10/16.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Piece {

    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    //method without body - to be implemented by child class
    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();
}
