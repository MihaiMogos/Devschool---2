package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Robert on 20-Oct-16.
 */

@AllArgsConstructor
public class Square {

    /*
     encapsulation
     public
     protected
     package - default
     private
      */

    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

    public Square() {
        super(); //apeleaza object
    }

    /***
    public int getRow() { return this.row; }
    public void setRow(int row){ this.row = row; }
        // row = row ---> shadowing
    */

}
