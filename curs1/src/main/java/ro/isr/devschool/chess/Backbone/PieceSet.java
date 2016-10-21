package ro.isr.devschool.chess.Backbone;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Exceptions.InvalidPieceSetException;

import java.util.List;

/**
 * Created by Lucian on 20/10/2016.
 */

@Getter

public class PieceSet {

    private List<Piece> pieces;
    @Setter
    private PieceColor color;

    public PieceSet(List<Piece> pieces, PieceColor color) {
        this.setPieces(pieces);
        this.setColor(color);
    }

    private void validatePieceSet(List<Piece> pieces) {
        if (pieces == null || pieces.size() != 16) {
            throw new InvalidPieceSetException();
        }
    }


    public void setPieces(List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }
}
