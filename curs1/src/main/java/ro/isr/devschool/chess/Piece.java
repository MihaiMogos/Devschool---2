package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex Dragan on 10/20/2016.
 */
@Getter
@Setter
@AllArgsConstructor

public abstract class Piece {

    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    //methods without body - to be implemented bu child class
    public abstract Square[] validMoves();
    public abstract  Square[] attackSquares();
    public abstract  Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();

}
