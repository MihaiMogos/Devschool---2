package ro.isr.devschool.chess;

/**
 * Created by nilatac on 10/20/2016.
 */
public interface PlayerEngine {
    /*
        *atribut static final public
        metode abstracte
        de la java 8 metode default

        *final = const
        -metode     --> !override
        -atribute   --> !changed
        -clase      --> !inheritance
        -parametri  --> nu pot schimba val referintei, dar pot schimba val Obj

        *static - atribute/metode apartinand clasei de obiecte si nu unui obiect!!!
                - blocuri statice - folosite in clase sau metode
                - clase statice -innerclass

     */
    public static final String testAtribut = "TEST";
    String testAtribut2 = "TEST2";
    public void makeMove();
}
