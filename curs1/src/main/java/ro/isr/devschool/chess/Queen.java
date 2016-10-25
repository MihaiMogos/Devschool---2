package ro.isr.devschool.chess;

/**
 * Created by Computer on 10/20/2016.
 */

public class Queen extends Piece {

    public Queen(PieceColor color, Square placeAt){
        super(color, placeAt, false);
    }

    public Square[] validMoves() {
        return new Square[0];
    }

    public Square[] attackSquare() {
        return new Square[0];
    }

    public Square[] captureFreeMoves() {
        return new Square[0];
    }

    public Square[] toBeCaptured() {
        return new Square[0];
    }
}
