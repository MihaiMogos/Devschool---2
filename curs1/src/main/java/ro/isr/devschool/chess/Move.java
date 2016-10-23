package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.Piece;

/**
 * Created by user on 10/23/2016.
 */
@Getter @Setter
@AllArgsConstructor
public class Move {

    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;

    public void move(){

    }
}
