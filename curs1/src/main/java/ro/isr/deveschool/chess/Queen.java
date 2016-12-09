package ro.isr.deveschool.chess;

/**
 * Created by Mihai MOGOS on 20/10/16.
 */
public class Queen extends Piece{


    public Queen(PieceColor color, Square placeAt) {
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
