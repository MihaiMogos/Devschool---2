package ro.isr.devschool.chess;

/**
 * Created by Alex Dragan on 10/23/2016.
 */
public enum CheckStatus {

    BlackInCheck,
    WhiteInCheck,
    BlackCheckmated,
    WhiteCheckmated,
    None;

    @Override
    public String toString() {
        return super.toString();
    }
}
