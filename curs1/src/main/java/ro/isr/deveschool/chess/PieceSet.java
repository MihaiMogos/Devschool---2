package ro.isr.deveschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.deveschool.chess.exception.InvalidPieceSetException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihai MOGOS on 20/10/16.
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
        if (pieces == null || pieces.size() != 16)
            throw new InvalidPieceSetException();
    }

    public void setPieces(List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }

}
