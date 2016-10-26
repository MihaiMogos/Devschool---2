package ro.isr.devschool.chess;

/**
 * Created by ionut on 20.10.2016.
 */
public class Queen extends Piece {

    public Queen(PieceColor pieceColor, Square placeAt) {
        super(pieceColor, placeAt, false);
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
