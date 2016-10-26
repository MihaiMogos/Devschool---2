package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.PieceColor;
import ro.isr.devschool.chess.pieces.PieceSet;

/**
 * Created by Beatrice on 23.10.2016.
 */
@Getter @Setter
public class Board {
    private Square[][] squares;
    private PieceSet[] pieceSets;
    private PieceColor pieceSetOnTop;


    public void create(){

    }

}
