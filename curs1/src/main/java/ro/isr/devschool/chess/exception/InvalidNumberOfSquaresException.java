package ro.isr.devschool.chess.exception;

/**
 * Created by ionut on 26.10.2016.
 */
public class InvalidNumberOfSquaresException extends RuntimeException {
    public InvalidNumberOfSquaresException() {
        super("Invalid number of squares exception");
    }
}
