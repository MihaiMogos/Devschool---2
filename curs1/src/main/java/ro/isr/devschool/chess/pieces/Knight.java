package ro.isr.devschool.chess.pieces;

import ro.isr.devschool.chess.Square;

/**
 * Created by Beatrice on 23.10.2016.
 */
public class Knight extends Piece{

    public Knight(PieceColor color, Square placeAt, boolean moved) {
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
