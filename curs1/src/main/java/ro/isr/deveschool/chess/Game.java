package ro.isr.deveschool.chess;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Cipri on 26.10.2016.
 */
@Setter
@Getter
public class Game {
    private List<Move> playerMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public void addMove(){};
    public void create(){};
    public void isEnded(){};
    public void isChecked(){};
    public void operation(){};
    public void isCheckmated(){};




}
