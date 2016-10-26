package ro.isr.deveschool.chess;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.*;

/**
 * Created by Cipri on 26.10.2016.
 */
@Getter
@Setter
public class Player implements PlayEngine {
    private PieceColor pieceColor;
    private PlayerEngine engine;

    public void makeMove() {

    }
}
