package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.exception.InvalidPieceSetException;

import java.security.Permission;
import java.util.List;

/**
 * Created by user on 10/20/2016.
 */

//JCF Java Collection Framework
    //de ce nu exista mostenire multipla?
    //la vector toate metodele sunt sincronizte (mai multe thread-uri nu pot avea acces la aceasi metoda)
@Getter
public class PieceSet {
    private List<Piece> pieces;
    @Setter
    private PieceColor color;

    public  PieceSet(List<Piece> pPieces, PieceColor pColor){

        setPieces(pPieces);
        this.color=pColor;

    }

    private void validatePieceSet(List<Piece> pPieces) {
        if(pPieces.size()!=16 || pPieces==null){
            throw new InvalidPieceSetException();
        }
    }

    public void setPieces(List<Piece> pPieces){
        validatePieceSet(pPieces);
        this.pieces=pPieces;
    }

}
