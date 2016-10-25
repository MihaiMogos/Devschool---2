package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Computer on 10/20/2016.
 */
@Getter
@Setter
@AllArgsConstructor

public abstract class Piece {
    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    public Piece(PieceColor color, Square placeAt, boolean b) {
    }

    public abstract Square[] validMoves();
    public abstract Square[] attackSquare();
    public abstract Square[] captureFreeMoves();
    public abstract Square[] toBeCaptured();

}
