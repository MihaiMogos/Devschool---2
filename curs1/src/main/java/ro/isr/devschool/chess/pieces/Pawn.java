package ro.isr.devschool.chess.pieces;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.MoveDirection;
import ro.isr.devschool.chess.PieceColor;
import ro.isr.devschool.chess.Square;

/**
 * Created by user on 10/23/2016.
 */
@Getter @Setter
public class Pawn extends Piece {

    private boolean promoted;
    private Piece promotedTo;
    private MoveDirection moveDirection;

    public Pawn(Square placeAt, PieceColor pieceColor, Piece pPromotedTo, MoveDirection pMoveDirection) {
        super(placeAt, pieceColor, false);
        this.promotedTo=pPromotedTo;
        this.moveDirection=pMoveDirection;

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
