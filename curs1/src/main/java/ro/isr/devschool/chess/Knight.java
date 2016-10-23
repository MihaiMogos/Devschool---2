package ro.isr.devschool.chess;

/**
 * Created by Alex Dragan on 10/23/2016.
 */
public class Knight extends Piece {

    public Knight(PieceColor color, Square placeAt, boolean moved) {
        super(color, placeAt, moved);
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
