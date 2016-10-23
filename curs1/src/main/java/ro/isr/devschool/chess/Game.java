package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Alex Dragan on 10/23/2016.
 */
@Setter @Getter @AllArgsConstructor
public abstract class Game {

    private List<Move> playedMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public abstract void addMove();
    public abstract void create();
    public abstract void isEnded();
    public abstract void isChecked();
    public abstract void Operation();
    public abstract void isCheckmated();
}
