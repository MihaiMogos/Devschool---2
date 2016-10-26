package ro.isr.devschool.chess.pieces;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Square;

/**
 * Created by Beatrice on 23.10.2016.
 */
@Getter @Setter
public class Pawn extends Piece {
    boolean promoted;
    Piece promoteTo;
    MoveDirection moveDirection;

    public Pawn(PieceColor color, Square placeAt, boolean moved, MoveDirection moveDirection) {
        super(color, placeAt, moved);
        this.moveDirection = moveDirection;
        this.promoted = false;
        this.promoteTo = null;
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
