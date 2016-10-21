package ro.isr.devschool.chess.Backbone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Lucian on 20/10/2016.
 */

@Getter @Setter @AllArgsConstructor
public class Square {

    // encapsulate things - don't expose more than is needed
    private int row;
    private int column;

}
