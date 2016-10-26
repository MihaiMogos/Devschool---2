package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.PieceColor;

import java.util.List;

/**
 * Created by Beatrice on 23.10.2016.
 */
@Getter @Setter @AllArgsConstructor
public class Game {
    private List<Move> playedMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public void addMove(){

    }

    public void create(){

    }

    public void isEnded(){

    }

    public void isChecked(){

    }

    public void operation(){

    }

    public void isCheckmated(){

    }
}
