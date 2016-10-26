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
public class Player {
    private PieceColor pieceColor;
    private playerEngine engine;
}
