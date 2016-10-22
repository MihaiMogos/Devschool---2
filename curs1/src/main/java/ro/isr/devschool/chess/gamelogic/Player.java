package ro.isr.devschool.chess.gamelogic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.PieceColor;

/**
 * Created by Valentin on 10/22/2016.
 */

@AllArgsConstructor
@Setter @Getter
public class Player {
    private PieceColor pieceColor;
    private PlayerEngine playerEngine;
}
