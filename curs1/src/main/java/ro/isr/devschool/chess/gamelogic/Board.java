package ro.isr.devschool.chess.gamelogic;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.piece.PieceColor;
import ro.isr.devschool.chess.piece.PieceSet;
import ro.isr.devschool.chess.exception.InvalidNumberOfPieceSetException;
import ro.isr.devschool.chess.exception.InvalidPieceSetException;

/**
 * Created by ionut on 26.10.2016.
 */

@Getter
public class Board {
    private Square[][] squares;
    private PieceSet[] pieceSets;
    @Setter
    private PieceColor pieceSetOnTop;

    public Board(Square[][] squares, PieceSet[] pieceSets, PieceColor pieceSetOnTop) {
        setSquares(squares);
        setPieceSets(pieceSets);
        this.pieceSetOnTop = pieceSetOnTop;
    }

    public void setSquares(Square[][] squares) {
        validateSquares(squares);
        this.squares = squares;
    }

    public void setPieceSets(PieceSet[] pieceSets) {
        validatePieceSets(pieceSets);
        this.pieceSets = pieceSets;
    }

    private void validatePieceSets(PieceSet[] pieceSets) {
        if (pieceSets == null || pieceSets.length != 2) {
            throw new InvalidNumberOfPieceSetException();
        }
    }

    private void validateSquares(Square[][] squares) {
        if (squares == null || squares.length != 8 || squares[0].length != 8) {
            throw new InvalidPieceSetException();
        }
    }
}
