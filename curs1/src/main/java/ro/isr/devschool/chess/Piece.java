package ro.isr.devschool.chess;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionut on 20.10.2016.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Piece {
    private PieceColor pieceColor;
    private Square placeAt;
    private boolean moved;

    //method without body - to be implemented bt child class
    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract  Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();
}
