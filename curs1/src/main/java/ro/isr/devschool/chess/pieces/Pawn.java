package ro.isr.devschool.chess.pieces;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.gamelogic.Square;

/**
 * Created by Valentin on 10/22/2016.
 */
@Getter @Setter
public class Pawn extends Piece {
    private MoveDirection moveDirection;
    private Piece promotedTo;
    private Boolean promoted;

    public Pawn(PieceColor color, Square place, MoveDirection moveDirection) {
        super(color, place, false);
        this.moveDirection = moveDirection;
        promoted = false;
        promotedTo = null;
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
        return false;
    }
}
