package ro.isr.devschool.chess.gamelogic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.isr.devschool.chess.piece.Piece;

/**
 * Created by ionut on 26.10.2016.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;
}
