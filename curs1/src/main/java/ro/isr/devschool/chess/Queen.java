package ro.isr.devschool.chess;

/**
 * Created by alin13 on 20.10.2016.
 */
public class Queen extends Piece {

    MoveDirection moveDirection;

    public Queen(PieceColor color, Square placeAt) {
        super(color, placeAt, false);
        this.moveDirection = null;

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
