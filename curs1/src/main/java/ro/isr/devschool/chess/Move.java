package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.exception.InvalidSquareException;
import ro.isr.devschool.chess.pieces.Piece;

/**
 * Created by Beatrice on 23.10.2016.
 */
@Getter
public class Move {
    private Square startSquare;
    private Square endSquare;
    @Setter
    private Piece piece;
    @Setter
    private Piece capturedPiece;

    public void validateSquare(Square square)
    {
        if (startSquare == null || square.getRow() >= 16 || square.getColumn() >= 16 ||
                square.getRow() < 0 || square.getColumn() < 0) {
            throw new InvalidSquareException();
        }
    }

    public void setStartSquare(Square startSquare) {
        validateSquare(startSquare);
        this.startSquare = startSquare;
    }

    public void setEndSquare(Square endSquare)
    {
        validateSquare(endSquare);
        this.endSquare = endSquare;
    }

    public void Move(Square startSquare, Square endSquare, Piece piece, Piece capturedPiece)
    {
        this.setStartSquare(startSquare);
        this.setEndSquare(endSquare);
        this.setPiece(piece);
        this.setCapturedPiece(capturedPiece);
    }

}
