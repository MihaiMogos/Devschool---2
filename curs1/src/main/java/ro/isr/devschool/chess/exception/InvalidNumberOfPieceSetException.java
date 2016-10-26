package ro.isr.devschool.chess.exception;

/**
 * Created by ionut on 26.10.2016.
 */
public class InvalidNumberOfPieceSetException extends RuntimeException{
    public InvalidNumberOfPieceSetException() {
        super("Invalid number of piece set exception");
    }
}
