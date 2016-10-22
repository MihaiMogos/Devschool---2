package ro.isr.devschool.chess.gamelogic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.chess.pieces.PieceColor;

import java.util.List;

/**
 * Created by Valentin on 10/22/2016.
 */
@AllArgsConstructor
@Getter @Setter
public class Game {
    private List<Move> playedMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    public void addMove()
    {
        //TODO implement this method
    }

    public void create()
    {
        //TODO implement this method
    }

    public Boolean isEnded()
    {
        return false;
        //TODO uncomment this line and check if the game is draw
//        return isCheckmated() || isDraw();
    }

    public Boolean isChecked()
    {
        return checkStatus==CheckStatus.WhiteInCheck || checkStatus==CheckStatus.BlackInCheck;
    }

    public Boolean isCheckmated()
    {
        return checkStatus==CheckStatus.WhiteCheckMated || checkStatus==CheckStatus.BlackCheckmated;
    }

    public void operation()
    {
        //TODO IMPLEMENT THIS METHOD
    }
}
