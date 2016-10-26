package ro.isr.devschool.chess;


import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

/**
 * Created by nilatac on 10/20/2016.
 */
@AllArgsConstructor
public class Square {
    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

//    public Square(){
//        super();
//
//    }

}
