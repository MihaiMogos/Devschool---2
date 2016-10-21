package ro.isr.devschool.chess.Backbone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Backbone.PieceColor;
import ro.isr.devschool.chess.Backbone.Square;

/**
 * Created by Lucian on 20/10/2016.
 */

@Getter @Setter @AllArgsConstructor
public abstract class Piece {

    private PieceColor pieceColor;
    private Square placeAt;
    private boolean moved;

    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();

}
