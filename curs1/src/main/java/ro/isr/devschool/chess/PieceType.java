package ro.isr.devschool.chess;

/**
 * Created by alin13 on 20.10.2016.
 */
public enum PieceType {
    PAWN, KING, QUEEN, ROOK, BISHOP, KNIGHT;

    /*
        method inherited from object
        Other inherited from Object:
            hashcode - identify an object by a number
            equals - compare if two objects are equal
            equals ---> hashcode TRUE
            hashcode ---> equals NOT NECESSARY
            protected finalize
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
