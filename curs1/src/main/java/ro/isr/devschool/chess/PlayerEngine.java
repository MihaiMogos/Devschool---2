package ro.isr.devschool.chess;

/**
 * Created by Robert on 20-Oct-16.
 */
public interface PlayerEngine {
    /*
        *atribute public static final
        *metode abstracte
        *metode default (de la java8)

        *final - desemneaza o constanta (const)
        * - metode ---> nu poate fi suprascris)
        * - atribute ---> nu poate fi modificat, initializat la declarare sau in TOTI constructorii
        * - clase ---> nu poate fi mostenita/derivata
        * - parametri ---> nu isi pot modifica valoarea dar obiectele isi pot modifica starea

        *static - desemneaza atribute si metode care apartine Clasei de obiecte si nu unui obiect
        * - a/m la nivel de clasa nu de instanta
        * - metode utilitare
        * - clase statice (innerclass)
        * !!!metodele trebuie sa fie atomice
        *

        *blocuri statice - se folosesc fie in metode fie in clase
     */
    void makeMove();
}
