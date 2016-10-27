package ro.isr.devschool.chess.pieces;

import ro.isr.devschool.chess.enumeration.PieceColor;
import ro.isr.devschool.chess.Square;

/**
 * Created by user on 25.10.2016.
 */
public class King extends Piece {

    public King(PieceColor pieceColor, Square placeAt,Boolean moved)
    {
        super(pieceColor,placeAt,false);
    }


    public Square[] validMoves() {
        return new Square[0];
    }

    public Square[] attackSquares() {
        return new Square[0];
    }

    public Square[] captureFreeMoves() {
        return new Square[0];
    }

    public Boolean toBeCaptured() {
        return null;
    }
}
