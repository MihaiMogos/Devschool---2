package ro.isr.devschool.chess;

/**
 * Created by user on 10/20/2016.
 */

//Automat este un Singleton

public enum PieceType {

    PAWN,KING,QUEEN,ROOK,BISHOP,KNIGHT;

    /*
    mostenita din Object -> hashcode,equals,protected finalize
    equals----->hashcode
    if equals -> hashcode -->interview question
    if hashcode -> not necessary
    protected finalize (garbage collector)
    new Object ->1. stack (reference) 2. heap (create an object) 3. reference 1+2
    eligible for garbage collector --->finalize
     */

    @Override
    public String toString(){
        return toString();
    }


}
