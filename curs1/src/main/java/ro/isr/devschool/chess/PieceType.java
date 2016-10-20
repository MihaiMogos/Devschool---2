package ro.isr.devschool.chess;

/**
 * Created by Robert on 20-Oct-16.
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

    Other  inherited from object:
        hashcode - identify an object by a number
        equals - compare if two objects are equal
        equals ----> hashcode TRUE (intrebare interviu) //din ce categorie este un obiect
        hashcode --> equals NOT NECESSARY //exact obiectul

        protected finalize //apelata de garbage collector automat

        business logic
     */

    //Square s = new Square();
    // stack -- heap (referinta s->h)


    @Override
    public String toString() {
        return super.toString(); //highlight ca e din object
    }
}
