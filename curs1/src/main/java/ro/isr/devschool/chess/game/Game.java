package ro.isr.devschool.chess.game;

import com.sun.org.apache.xpath.internal.operations.Bool;
import ro.isr.devschool.chess.enumeration.CheckStatus;
import ro.isr.devschool.chess.enumeration.PieceColor;
import ro.isr.devschool.chess.enumeration.Result;

import java.util.List;

/**
 * Created by user on 25.10.2016.
 */
public class Game {

    private List<Move> playedMoves;
    private PieceColor turn;
    private Player[] players;
    private Result result;
    private CheckStatus checkStatus;

    private void addMove(){}
    private void create(){}
    private void isEnded(){}
    private boolean isChecked(){
        if(checkStatus==CheckStatus.BlackInCheck|| checkStatus==CheckStatus.WhiteInCheck)
            return true;
            else
                return false;
    }
    private void operation(){}

    private boolean isCheckmated(){
        if(checkStatus==CheckStatus.BlackCheckmated || checkStatus==CheckStatus.WhiteInCheck)
            return true;
        else
            return false;

    }
}
