package ro.isr.devschool.chess;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Sebastian on 20-Oct-16.
 */
@AllArgsConstructor
public class Square {
    /*

    encapsulation - don't expose more than is needed
    public
    protected
    package - default
    privat

     */

    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

}
