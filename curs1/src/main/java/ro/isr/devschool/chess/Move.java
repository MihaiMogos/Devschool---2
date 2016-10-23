package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex Dragan on 10/23/2016.
 */
@Setter @Getter @AllArgsConstructor
public abstract class Move {

    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;

    public abstract void Move();
}
