package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex Dragan on 10/23/2016.
 */
@Setter @Getter @AllArgsConstructor
public abstract class Board {

    private Square[][] squares;
    private PieceSet[] pieceSets;
    private PieceColor pieceSetOnTop;

    public abstract void create();
}


