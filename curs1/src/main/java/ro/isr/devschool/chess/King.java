package ro.isr.devschool.chess;

/**
 * Created by Sebastian on 26-Oct-16.
 */
public class King extends Piece {

    public King(PieceColor color, Square placeAt, boolean moved){
        super(color,placeAt,false);
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

    public boolean toBeCapture() {
        return false;
    }
}
