package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.PieceColor;

/**
 * Created by Beatrice on 23.10.2016.
 */
@Getter @Setter @AllArgsConstructor
public class Player {
    private PieceColor pieceColor;
    private PlayerEngine engine;
}
