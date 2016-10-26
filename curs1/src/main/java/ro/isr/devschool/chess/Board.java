package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Computer on 10/25/2016.
 */
@AllArgsConstructor
@Getter
@Setter

public class Board {
    private Square [][] squares;
    private PieceSet[] peaceSets;
    private PieceColor peaceSetOnTop;

    private void create(){

    }
}
