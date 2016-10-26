package ro.isr.devschool.chess.piece;

import ro.isr.devschool.chess.gamelogic.Square;

/**
 * Created by ionut on 26.10.2016.
 */
public class King extends Piece {
    public King(PieceColor pieceColor, Square placeAt) {
        super(pieceColor, placeAt, true);
    }
}
