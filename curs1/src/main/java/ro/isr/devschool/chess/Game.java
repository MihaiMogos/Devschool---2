package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.Backbone.PieceColor;
import ro.isr.devschool.chess.GameLogic.CheckStatus;
import ro.isr.devschool.chess.GameLogic.Move;
import ro.isr.devschool.chess.GameLogic.Result;
import ro.isr.devschool.chess.Player.Player;

import java.util.List;

/**
 * Created by Lucian on 21/10/2016.
 */

@Getter
@Setter
@AllArgsConstructor

public class Game {
    private List<Move> playedMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public void addMove() {
        // to do implementation
    }

    public void create() {
        // to do implementation
    }

    public void isEnded() {
        // to do implementation
    }

    public void isChecked() {
        // to do implementation
    }

    public void operation() {
        // to do implementation
    }

    public void isCheckmated() {
        // to do implementation
    }
}
