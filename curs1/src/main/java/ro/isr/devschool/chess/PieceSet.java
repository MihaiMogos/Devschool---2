package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Robert on 20-Oct-16.
 */
@Getter
public class PieceSet {

    private List<Piece> pieces;
    @Setter private PieceColor color;

    public PieceSet(List<Piece> pieces, PieceColor color) {
        setPieces(pieces);
        this.color = color;

//      ExampleInnerClass.ExampleInnerClass2 eic = new ExampleInnerClass().ExampleInnerClass2();
    }

    private void validatePieceSet(List<Piece> pieces) {
        if (pieces.size() != 16 || pieces == null)
            throw new InvalidPieceSetException();
    }

    public void setPieces(List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }



}

