package ro.isr.devschool.chess;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Sebastian on 20-Oct-16.
 */

@Getter 
@Setter
@AllArgsConstructor
public abstract class Piece {

    private PieceColor pieceColor;
    private Square placeAt;
    private Boolean moved;

    public Piece(PieceColor color, Square placeAt, boolean b) {
    }

    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCapture();
}
