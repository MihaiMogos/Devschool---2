package ro.isr.devschool.chess;

/**
 * Created by Mucefix on 20/10/16.
 */
public enum PieceType {

    PAWN,
    KING,
    QUEEN,
    ROOK,
    BISHOP,
    KNIGHT;


    /*
    method inherited from object
    Other inherited from Object:
        hashcode - identify an object by a number
        equals - compare if two objects are equal
        equals ----> hashcode TRUE
        hashcode ----> equals NOT NECESARRY
        protected finalize
    */
    @Override
    public String toString() {
        return super.toString();
    }
}
