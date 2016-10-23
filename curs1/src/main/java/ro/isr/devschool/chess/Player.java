package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex Dragan on 10/23/2016.
 */
@Setter @Getter @AllArgsConstructor
public class Player {

    private PieceColor pieceColor;
    private PlayEngine engine;
}
