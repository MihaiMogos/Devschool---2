package ro.isr.devschool.chess;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Computer on 10/20/2016.
 */
@Getter
public class PieceSet {
    private List<Piece> pieces;
    @Setter
    private PieceColor color;

    public PieceSet(List<Piece> pieces, PieceColor color){
        setPieces(pieces);
        this.color = color;

        ExampleInnerClassDoNotUse.ExampleInnerInnerClass ceva = new ExampleInnerClassDoNotUse.ExampleInnerInnerClass();
    }

    private void validatePiceSet(List<Piece> pieces) {
        if(pieces == null || pieces.size() != 16){
            throw new InvalidPieceSetException();
        }
    }

    public void setPieces(List<Piece> pieces){
        validatePiceSet(pieces);
        this.pieces = pieces;
    }
}
