package ro.isr.devschool.chess.exception;

/**
 * Created by user on 10/20/2016.
 */

//trowable -> inseamna ca poate fi prinsa (try catch block)
    //errorile pot fi prinse si logate
    //check si runtime exception
    //Exception -> chestii "nasoale"
    //RunTimeException
public class InvalidPieceSetException extends RuntimeException{

    public InvalidPieceSetException(){
        super("Invalid PieceSetNumber");
    }
}
