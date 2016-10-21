package ro.isr.devschool.chess.GameLogic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Backbone.Piece;
import ro.isr.devschool.chess.Backbone.Square;

/**
 * Created by Lucian on 21/10/2016.
 */

@Getter
@Setter
@AllArgsConstructor
public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;

    // !to analyse game-logic and change the default constructor
    public Move() {
        this.setStartSquare(null);
        this.setEndSquare(null);
        this.setPiece(null);
        this.setCapturedPiece(null);
    }
}
