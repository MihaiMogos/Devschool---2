package ro.isr.devschool.chess.players;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.PieceColor;

/**
 * Created by user on 10/23/2016.
 */
@Getter @Setter
@AllArgsConstructor
public class Player {

    private PieceColor pieceColor;
    private PlayerEngine engine;
}
