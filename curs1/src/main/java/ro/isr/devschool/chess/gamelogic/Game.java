package ro.isr.devschool.chess.gamelogic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.isr.devschool.chess.piece.PieceColor;
import ro.isr.devschool.chess.player.Player;

import java.util.List;

/**
 * Created by ionut on 26.10.2016.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Game {
    private List<Move> playedMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public void addMove() {
        //TODO implemention for this method
    }

    public void create() {
        //TODO implemention for this method
    }

    public boolean isEnded() {
        //TODO implemention for this method
        return false;
    }

    public boolean isChecked() {
        //TODO implemention for this method
        return false;
    }

    public void operation() {
        //TODO implemention for this method
    }

    public boolean isCheckmated() {
        //TODO implemention for this method
        return false;
    }
}
