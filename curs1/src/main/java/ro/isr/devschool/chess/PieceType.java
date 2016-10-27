package ro.isr.devschool.chess;

/**
 * Created by Sebastian on 20-Oct-16.
 */
public enum PieceType {
    PAWN,
    KING,
    QUEEN,
    ROCK,
    BISHOP,
    KNIGHT;

    /*
    method inherited from object
    Other inherited from Object:
        hashcode - identify an object by number
        equals - compare if two objecrs are equal
        equals ----->  hashcode TRUE
        hashcode ----> equals NOT NECESARRY
        protected finalize - apelata de garbage colector
                           -  o singura data
                           -
    */

    @Override
    public String toString(){
        return super.toString();
    }

}
