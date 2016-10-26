package ro.isr.devschool.chess.gamelogic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionut on 20.10.2016.
 */
@AllArgsConstructor
public class Square {

    /*
     encapsulation - don't expose more than is needed
     public
     protected
     package - default
     private
     */
    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

    /*
    //default constructor
    public Square() {
        super();
    }
    */

    /*
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
        //row = row ---> shadowing
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    */
}
