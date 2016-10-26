package ro.isr.devschool.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by nilatac on 10/20/2016.
 */
@Getter
@Setter
@AllArgsConstructor
public class Player {
    private PieceColor color;
    private PlayerEngine engine;
}
