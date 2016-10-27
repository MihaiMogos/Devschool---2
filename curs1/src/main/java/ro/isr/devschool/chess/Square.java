package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Mucefix on 20/10/16.
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

    //default constructor
    /*
    public Square(){
        super();
    }
    */

    /*
    public int getRow(){
        return this.row;
    }
    public void setRow(int row){
        this.row = row;
        // row = row; ----> shadowing
    }
    */


}
