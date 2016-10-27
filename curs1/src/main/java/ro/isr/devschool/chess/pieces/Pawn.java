package ro.isr.devschool.chess.pieces;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Square;
import ro.isr.devschool.chess.enumeration.MoveDirection;
import ro.isr.devschool.chess.enumeration.PieceColor;

/**
 * Created by user on 25.10.2016.
 */

@Getter @Setter
public class Pawn extends Piece {

    private Boolean promoted;
    private Piece promotedTo;
    private MoveDirection moveDirection;

    public Pawn(PieceColor color,Square placeAt, Boolean moved, boolean promoted,
                Piece promotedTo,MoveDirection move)
    {
        super(color,placeAt,moved);

        this.promoted=promoted;
        this.promotedTo=promotedTo;
        this.moveDirection=move;
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
        return null;
    }
}
