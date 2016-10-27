package ro.isr.devschool.chess.pieces;

//import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;
import ro.isr.devschool.chess.enumeration.PieceColor;
import ro.isr.devschool.chess.exception.InvalidPieceSetException;
import ro.isr.devschool.chess.pieces.Piece;

import java.util.List;


/**
 * Created by user on 20.10.2016.
 */

@Getter
public class PieceSet {

    private List<Piece> pieces;
    private PieceColor color;

    public PieceSet(List<Piece> pieces, PieceColor color) {

        validatePieceSet(pieces);

        this.color = color;
        setPieces(pieces);

    }

    private void validatePieceSet(List<Piece> pieces) {
        if (pieces==null || pieces.size() != 16 )
            throw new InvalidPieceSetException();
    }

    public void setPieces(List<Piece> pieces)
    {
        validatePieceSet(pieces);
        this.pieces=pieces;
    }

    //ExampleInnerClassDoNotUse.ExampleInnerClassDoNotUse x=new ExampleInnerClassDoNotUse();

}