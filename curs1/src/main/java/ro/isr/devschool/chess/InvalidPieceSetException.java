package ro.isr.devschool.chess;

/**
 * Created by Computer on 10/20/2016.
 */

public class InvalidPieceSetException extends RuntimeException {
    public InvalidPieceSetException(){
        super("Invalid piece set exception");
    }
}
