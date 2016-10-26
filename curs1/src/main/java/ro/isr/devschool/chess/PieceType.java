package ro.isr.devschool.chess;

/**
 * Created by ionut on 20.10.2016.
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
    Other inherited from Object;
        hashcode -- identify as object by a number
        equals -- compare if two object  are equal
        equals ---> hashcode TRUE
        hashcode --> equals NOT NECESSARY
        protected
        finalize -- it's call one time when no variable point to a heap value

     */
    @Override
    public String toString() {
        return super.toString();
    }
}
