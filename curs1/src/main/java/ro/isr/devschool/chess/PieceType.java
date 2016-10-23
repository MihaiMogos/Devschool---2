package ro.isr.devschool.chess;

/**
 * Created by Alex Dragan on 10/20/2016.
 */
public enum PieceType {

    PAWN,
    KING,
    QUEEN,
    ROOK,
    BISHOP,
    KNIGHT;

    /*
    method inherted from object
    Other inherited from Object:
        hashcode - indentify an object by a number
        equals - compare if two object are equal
        equals ---> hashcode TRUE
        hashcode ----> equals NOT NECESARRY
        private finalize
     */

    @Override
    public String toString() {
        return super.toString();
    }
}
