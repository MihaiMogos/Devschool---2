package ro.isr.devschool.chess.exception;

/**
 * Created by ionut on 20.10.2016.
 */
public class InvalidPieceSetException extends RuntimeException {
    public InvalidPieceSetException() {
        super("Invalid piece set exception");
    }
}
