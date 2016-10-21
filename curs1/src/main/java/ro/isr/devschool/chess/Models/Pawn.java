package ro.isr.devschool.chess.Models;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Backbone.MoveDirection;
import ro.isr.devschool.chess.Backbone.Piece;
import ro.isr.devschool.chess.Backbone.PieceColor;
import ro.isr.devschool.chess.Backbone.Square;

/**
 * Created by Lucian on 21/10/2016.
 * game logic implementation must be done
 */

@Getter
@Setter
public class Pawn extends Piece {
    private boolean promoted;
    private Piece promoteTo;
    private MoveDirection moveDirection;

    public Pawn(PieceColor pieceColor, Square placeAt) {
        super(pieceColor, placeAt, false);

        this.setPromoted(false);
        this.setPromoteTo(null);
        this.setMoveDirection(null);
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
