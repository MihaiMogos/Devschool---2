package ro.isr.devschool.chess.gamelogic;


import lombok.AllArgsConstructor;

/**
 * Created by Valentin on 10/20/2016.
 */
@AllArgsConstructor
public class Square {
    /* public protected package private*/

    private int row;
    private int column;


    public int getRow() {
        return row;
    }

    public void setRow(int row)
    {
        this.row =row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column)
    {
         this.column=column;
    }
}
