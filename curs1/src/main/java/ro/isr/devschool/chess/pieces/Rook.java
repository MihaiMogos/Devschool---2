package ro.isr.devschool.chess.pieces;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.PieceColor;
import ro.isr.devschool.chess.Square;

/**
 * Created by user on 10/23/2016.
 */
@Getter @Setter
public class Rook extends Piece{

    public Rook(Square placeAt, PieceColor pieceColor) {
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
