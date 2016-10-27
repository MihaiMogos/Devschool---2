package ro.isr.devschool.chess.pieces;

import ro.isr.devschool.chess.enumeration.PieceColor;
import ro.isr.devschool.chess.Square;

/**
 * Created by user on 25.10.2016.
 */
public class Rook extends Piece{

    public Rook(PieceColor color, Square placeAt,Boolean moved)
    {
        super(color,placeAt,moved);
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
