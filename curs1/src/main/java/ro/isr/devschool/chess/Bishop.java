package ro.isr.devschool.chess;

/**
 * Created by Computer on 10/25/2016.
 */

public class Bishop extends Piece {
    public Bishop (PieceColor color, Square placeAt){
        super(color, placeAt, false);
    }

    public Square[] validMoves() {
        return new Square[0];
    }

    public Square[] attackSquare() {
        return new Square[0];
    }

    public Square[] captureFreeMoves() {
        return new Square[0];
    }

    public boolean toBeCaptured() {
        return false;
    }
}
