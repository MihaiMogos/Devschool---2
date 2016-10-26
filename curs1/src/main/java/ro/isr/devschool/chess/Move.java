package ro.isr.devschool.chess;

/**
 * Created by Computer on 10/25/2016.
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;

    public Move(){

    }
}
