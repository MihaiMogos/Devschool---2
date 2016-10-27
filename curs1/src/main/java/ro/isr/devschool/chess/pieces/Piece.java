package ro.isr.devschool.chess.pieces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.enumeration.PieceColor;
import ro.isr.devschool.chess.Square;

/**
 * Created by user on 20.10.2016.
 */
@Getter @Setter
@AllArgsConstructor
public abstract class Piece {


    private PieceColor pieceColor;
    private Square placeAt;
    private Boolean moved;

    //method without body- to be implemented by child class
    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract Boolean toBeCaptured();

}
