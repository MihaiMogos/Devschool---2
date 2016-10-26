package ro.isr.devschool.chess.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.piece.PieceColor;

/**
 * Created by ionut on 26.10.2016.
 */
@AllArgsConstructor
@Getter
@Setter
public class Player {
    private PieceColor pieceColor;
    private PlayEngine engine;
}
