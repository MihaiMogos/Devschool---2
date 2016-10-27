package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Exception.InvalidPieceSetException;

import java.util.List;

/**
 * Created by Sebastian on 20-Oct-16.
 */
@Getter
@Setter
public class PieceSet {
    private List<Piece> pieces;
    private PieceColor color;

    public PieceSet(List<Piece>pieces,PieceColor color){
        setPieces(pieces);
        this.color = color;

    }

    private void validatePieceSet(List<Piece> pieces) {
        if(pieces == null || pieces.size() != 16){
            throw new InvalidPieceSetException();
        }
    }

    public void setPieces (List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }

}
