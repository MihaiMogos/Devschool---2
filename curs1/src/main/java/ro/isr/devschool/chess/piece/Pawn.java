package ro.isr.devschool.chess.piece;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.gamelogic.MoveDirection;
import ro.isr.devschool.chess.gamelogic.Square;

/**
 * Created by ionut on 26.10.2016.
 */
@Getter
@Setter
public class Pawn extends Piece {
    private boolean promoted;
    private Piece promotedTo;
    private MoveDirection moveDirection;

    public Pawn(PieceColor pieceColor, Square placeAt, boolean moved, boolean promoted, Piece promotedTo, MoveDirection moveDirection) {
        super(pieceColor, placeAt, moved);
        this.promoted = promoted;
        this.promotedTo = promotedTo;
        this.moveDirection = moveDirection;
    }
}
