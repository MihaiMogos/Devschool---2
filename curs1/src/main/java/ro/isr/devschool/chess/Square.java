package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by user on 10/20/2016.
 */

//dependenta in maven pentru librari externe ->lombok

@AllArgsConstructor
public class Square {
    //private ->incapsulare
    //public protected (clasele care mostenesc) package-default private
    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;
//default constructor
    public Square(){
        super();
    }

}
