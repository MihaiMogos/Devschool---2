package ro.isr.devschool.chess;

/**
 * Created by Computer on 10/25/2016.
 */
public class Pawn extends Piece {

    private boolean promoted;
    private Piece promoteTo;
    private moveDirection MoveDirection;

    public Pawn (PieceColor color, Square placeAt){
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
