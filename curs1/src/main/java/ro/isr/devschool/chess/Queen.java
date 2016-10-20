package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by user on 10/20/2016.
 */

@Getter @Setter
public class Queen extends Piece {

    public Queen(Square placeAt, PieceColor pieceColor) {
        super(placeAt, pieceColor, false);
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
