package ro.isr.devschool.chess.gamelogic;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.Piece;

/**
 * Created by Valentin on 10/22/2016.
 */
@Getter
@Setter
public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;

    public Move(Square startSquare, Square endSquare, Piece piece, Piece capturedPiece) {
        this.startSquare = startSquare;
        this.endSquare = endSquare;
        this.piece = piece;
        this.capturedPiece = capturedPiece;
    }

    public Move() {
        this.setStartSquare(null);
        this.setEndSquare(null);
        this.setPiece(null);
        this.setCapturedPiece(null);
    }
}
