package ro.isr.devschool.chess;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.exception.InvalidPieceSetException;

import java.util.List;

/**
 * Created by Alex Dragan on 10/20/2016.
 */
@Getter
public class PieceSet {

    private List<Piece> pieces;
    @Setter
    private PieceColor color;

    public PieceSet(List<Piece> pieces, PieceColor color) {
        setPieces(pieces);
        this.color = color;

        ExampleInnerClassDoNotUse.ExampleInnerInnerClass cucu = new ExampleInnerClassDoNotUse.ExampleInnerInnerClass();
    }

    private void validatePieceSet(List<Piece> pieces) {
        if(pieces == null || pieces.size() != 16)
            throw new InvalidPieceSetException();
    }

    public void setPieces(List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }
}
