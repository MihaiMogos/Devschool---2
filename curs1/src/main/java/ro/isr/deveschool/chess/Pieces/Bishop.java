package ro.isr.deveschool.chess.Pieces;

import ro.isr.deveschool.chess.Piece;
import ro.isr.deveschool.chess.PieceColor;
import ro.isr.deveschool.chess.Square;

/**
 * Created by Mucefix on 20/10/16.
 */
public class Bishop extends Piece {


    public Bishop(PieceColor color, Square placeAt) {
        super(color, placeAt, false);
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

    public boolean toBeCaptured() {
        return false;
    }
}
