package ro.isr.devschool.chess;

/**
 * Created by Alex Dragan on 10/20/2016.
 */
public interface PlayEngine {

    /*
        intr-o interfata putem avea:
            - atribute public, static si final
            - metode abstracte
            - de la java 8 metode default

        final - desemneaza o constanta
            - metode --> nu poate fi suprascrisa
            - atribute --> nu poate fi modificat, trebuie initializat ori la declarare, ori in TOTI constructorii
            - clase --> nu poate fi mostenita/derivata/extinsa
            - parametri --> nu isi pot modifica valoarea (daca sunt obiecte, isi modifica starea)

        static - desemneaza atribute si metode care apartin CLASEI de obiecte si nu unui obiect
               - blocuri statice --> fie in metode fie in clase
               - clase statice --> doar inner class
     */

    public void makeMove();
}
