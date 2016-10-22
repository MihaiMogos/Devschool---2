package ro.isr.devschool.chess.gamelogic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.PieceColor;
import ro.isr.devschool.chess.pieces.PieceSet;

/**
 * Created by Valentin on 10/22/2016.
 */

@AllArgsConstructor
@Getter @Setter
public class Board {
    Square[][] squares;
    PieceSet[] pieceSets;
    PieceColor pieceSetOnTop;

    public void create()
    {
        //TODO Implement this method
    }
}
