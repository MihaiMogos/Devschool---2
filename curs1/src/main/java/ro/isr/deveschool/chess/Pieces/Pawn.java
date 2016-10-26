package ro.isr.deveschool.chess.Pieces;

import lombok.Getter;
import lombok.Setter;
import ro.isr.deveschool.chess.MoveDirection;
import ro.isr.deveschool.chess.Piece;
import ro.isr.deveschool.chess.PieceColor;
import ro.isr.deveschool.chess.Square;

/**
 * Created by Mucefix on 20/10/16.
 */
@Getter
@Setter
public class Pawn extends Piece {

    private MoveDirection moveDirection;

    private Piece promoteTo;

    private boolean promoted;

    public Pawn(PieceColor color, Square placeAt) {
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
