package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by nilatac on 10/20/2016.
 */
@Getter
@Setter
public class Pawn extends Piece {
    private boolean promoted;
    private Piece promotedTo;
    private MoveDirection moveDirection;

    //TODO constructor will all atributes
    // to many atributes ---> builder

    public Pawn(PieceColor color, Square placeAt, boolean moved) {
        super(color, placeAt, moved);
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
