package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Robert on 20-Oct-16.
 */
@Getter
@Setter
@AllArgsConstructor

public abstract class Piece {

    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    // method without body - to be implemented by child class
    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();



    // composition over inheritance
}
