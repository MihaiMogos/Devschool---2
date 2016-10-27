package ro.isr.devschool.chess.Exception;

/**
 * Created by Sebastian on 20-Oct-16.
 */
public class InvalidPieceSetException extends RuntimeException {

    public InvalidPieceSetException(){
        super("Invalid piece set exception");
    }
}
