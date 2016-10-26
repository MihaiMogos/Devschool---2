package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Computer on 10/26/2016.
 */
@AllArgsConstructor
@Getter
@Setter

public class Game {
    private List<Move> playedMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public void addMove() {

    }

    public void create() {

    }

    public void isEnded() {

    }

    public void isChecked() {

    }

    public void operation() {

    }

    public void isCheckmated() {

    }
}
