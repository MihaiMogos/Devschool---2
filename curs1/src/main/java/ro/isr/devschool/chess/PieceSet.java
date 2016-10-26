package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.exceptions.InvalidPieceSetException;

import java.util.List;
import java.util.concurrent.Exchanger;


/**
 * Created by nilatac on 10/20/2016.
 */
@Getter
@Setter
public class PieceSet {
    private List<Piece> pieces;
    private PieceColor color;

    public PieceSet(List<Piece> pieces, PieceColor color) throws InvalidPieceSetException{
        this.setPieces(pieces);
        this.setColor(color);

        //test inner class

    }

    private void validatePieceSet(List<Piece> pieces) {
        if(pieces == null || pieces.size() != 16) {
            throw new InvalidPieceSetException("The number of pieces is " + pieces.size());
        }
    }

    public void setPieces(List<Piece> pieces){
        validatePieceSet(pieces);
        this.pieces = pieces;
    }
}
