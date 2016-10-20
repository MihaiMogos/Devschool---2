package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.exception.ExampleInnerClassDoNotUse;
import ro.isr.devschool.chess.exception.InvalidPieceSetException;

import java.security.InvalidAlgorithmParameterException;
import java.util.List;

/**
 * Created by alin13 on 20.10.2016.
 */
@Getter
public class PieceSet {

    private List<Piece> pieces;
    @Setter
    private PieceColor color;

    public PieceSet(List<Piece> pieces, PieceColor color) {
        setPieces(pieces);
        this.color = color;

        ExampleInnerClassDoNotUse.ExampleInnerInnerClass ceva = new ExampleInnerClassDoNotUse.ExampleInnerInnerClass();
    }

    private void validatePieceSet(List<Piece> pieces) {
        if (pieces.size() != 16 || pieces == null) {
            throw new InvalidPieceSetException();
        }
    }

    public void setPieces(List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }
}
