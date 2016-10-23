package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.Piece;
import ro.isr.devschool.chess.players.Player;

import java.util.List;

/**
 * Created by user on 10/23/2016.
 */
@Getter @Setter
public class Game {
    private List<Move> playedMoved;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public Game(List<Move> playedMoved,Player[] players,PieceColor turn) {
        this.playedMoved=playedMoved;
        this.players=players;
        this.turn=turn;
        this.result=Result.DRAW;
        this.checkStatus=CheckStatus.NONE;
    }


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

    public void isCheckedmated(){

    }
}
