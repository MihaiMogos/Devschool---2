package ro.isr.devschool.chess.exception;

/**
 * Created by Beatrice on 23.10.2016.
 */
public class InvalidSquareException extends RuntimeException {
    public InvalidSquareException(){
        super("Invalid Square exception");
    }
}
