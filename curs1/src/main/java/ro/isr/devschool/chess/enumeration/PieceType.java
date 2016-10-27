package ro.isr.devschool.chess.enumeration;

/**
 * Created by user on 20.10.2016.
 */
public enum PieceType {
    PAWN,
    KING,
    QUEEN,
    ROOK,
    BISHOP,
    KNIGHT;

    /*method inheritated from Object

    hashcode-identify an object by a number
    equals-compare if two objects are equal

    equals----> hashcode true(daca am equals am si hashcode)
    hashcode----> equals  not necesarry

    (protected) finalize- apelata de GC atunci cand se hotaraste sa stearga obiectul(se apeleaza o singura data)

    */

    @Override
    public String toString() {
        return super.toString();

    }
}
