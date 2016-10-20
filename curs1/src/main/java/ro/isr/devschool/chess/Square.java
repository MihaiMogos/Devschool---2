package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by alin13 on 20.10.2016.
 */
@AllArgsConstructor
public class Square {

    /*
        Encapsulation - don't expose more than is needed
        public
        protected
        package - default
        private
    */
    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

}
