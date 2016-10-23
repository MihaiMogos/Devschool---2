package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex Dragan on 10/23/2016.
 */
@Setter @Getter
public class Pawn extends Piece {

    private boolean promoted;
    private Piece promoteTo;
    private MoveDirection moveDirection;

    public Pawn(PieceColor color, Square placeAt, boolean moved, boolean promoted, Piece promoteTo, MoveDirection moveDirection) {
        super(color, placeAt, moved);
        this.promoted = promoted;
        this.promoteTo = promoteTo;
        this.moveDirection = moveDirection;
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
