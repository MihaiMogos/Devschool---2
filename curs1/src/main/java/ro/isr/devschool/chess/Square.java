package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex Dragan on 10/20/2016.
 */
@AllArgsConstructor
public class Square {

    //encapsulation - don't expose more than is needed
    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

    //default constructor
//    public Square(){
//        super();
//    }
//    public int getRow(){
//        return row;
//    }
//    public void setRow(int row){
//        this.row = row;
//        // row = row ---> shadowing
//    }

}
