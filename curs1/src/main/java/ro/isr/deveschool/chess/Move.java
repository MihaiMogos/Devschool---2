package ro.isr.deveschool.chess;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Cipri on 26.10.2016.
 */

@Getter
@Setter
public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturePiece;

    public void move(){};
}
