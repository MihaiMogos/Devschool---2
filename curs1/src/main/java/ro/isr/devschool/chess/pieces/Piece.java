package ro.isr.devschool.chess.pieces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.gamelogic.Square;

/**
 * Created by Valentin on 10/20/2016.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Piece {
    private PieceColor color;

    private Square place;

    private Boolean moved;

    public abstract Square[] validMoves();

    public abstract Square[] attackSquares();

    public abstract Square[] captureFreeMoves();

    public abstract Boolean toBeCaptured();
}
