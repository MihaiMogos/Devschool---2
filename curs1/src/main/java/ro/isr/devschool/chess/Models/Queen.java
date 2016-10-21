package ro.isr.devschool.chess.Models;

import ro.isr.devschool.chess.Backbone.Piece;
import ro.isr.devschool.chess.Backbone.PieceColor;
import ro.isr.devschool.chess.Backbone.Square;

/**
 * Created by Lucian on 21/10/2016.
 * game logic implementation must be done
 */
public class Queen extends Piece{

    public Queen(PieceColor pieceColor, Square placeAt) {
        super(pieceColor, placeAt, false);
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
