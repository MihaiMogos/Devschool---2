package ro.isr.devschool.chess;

/**
 * Created by Valentin on 10/20/2016.
 */
public enum  PieceType {
    Pawn, King, Queen, Rock, Bishop, Knight;

    /*
    hashscode - identify an object by a number
    equals - compare if two objects are equal
    equals ->>>>> hashscode True
    hashcode->>>>>> equals Not necessary
    protected finalize
    */
    @Override
    public String toString() {
        return super.toString();
    }
}
