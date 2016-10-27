package ro.isr.devschool.chess.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Square;
import ro.isr.devschool.chess.pieces.Piece;

/**
 * Created by user on 25.10.2016.
 */

@AllArgsConstructor
@Getter @Setter
public class Move {

    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;

    private void Move()
    {

    }
}
