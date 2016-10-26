package ro.isr.devschool.chess.exceptions;

/**
 * Created by nilatac on 10/20/2016.
 */
public class InvalidPieceSetException extends RuntimeException {
    public InvalidPieceSetException(String message) {
        super(message);
    }
}
