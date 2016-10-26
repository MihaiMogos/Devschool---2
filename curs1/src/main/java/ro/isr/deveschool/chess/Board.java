package ro.isr.deveschool.chess;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.*;
import ro.isr.devschool.chess.PieceColor;

/**
 * Created by Cipri on 26.10.2016.
 */
@Getter
@Setter
public class Board {
    private Square[][] squares;
    private PieceSet[] pieceSet;
    private PieceColor pieceSetOnTop;

    public void create(){};
}
