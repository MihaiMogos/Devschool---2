package ro.isr.devschool.chess.exception;

/**
 * Created by Valentin on 10/20/2016.
 */
public class InvalidPieceSetException extends RuntimeException {

    public InvalidPieceSetException() {
        super("Invalid pieces number");
    }
}
