package ro.isr.devschool.chess;

//import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Created by user on 20.10.2016.
 */

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Getter @Setter
@AllArgsConstructor
public class Square {

    //encapsulation- don't expose more than is needed
    //public, protected, package-default, private

    private int row;
    private int column;

    //default constructor
   /* public Square()
    {
        super();
    }
    */



   /* public int getRow()
    {
       return row;
    }

    public void setRow(int row)
    {
        this.row=row;
        //row=row ---> shadowing
    } */



}
