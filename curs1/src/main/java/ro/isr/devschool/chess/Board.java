package ro.isr.devschool.chess;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by user on 10/23/2016.
 */

@Getter @Setter
public class Board {
    private Square[][] squares;
    private PieceSet[] pieceSets;
    private PieceColor pieceColor;

    public void create(){

    }

}
