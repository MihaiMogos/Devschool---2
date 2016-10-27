package ro.isr.devschool.chess;

/**
 * Created by Sebastian on 20-Oct-16.
 */

    /*Intr-o interfata putem avea asa:
    * -atribute statice,final si publice
    * -si metode abstracte
    * -de la java 8 methode default
    *
    * !!final - in java desemneaza o constanta
    * -metode     - nu pot fi suprasrise
    * -atribute   - nu poate fi modificat/ trebuie declarat ori la initializare ori in TOTI constructorii
    * -clase      - nu pot fi derivate/mostenite/extinse
    * -parametri  - nu isi pot moddifica valoare(daca sunt obiecte isi pot modifica starea)
    *
    * !!static - desemneaza atribute si metode care apartin CLASEI DE OBIECTE si nu unui obiect
    *       - blocuri statice --> se folosesc fie in metode fie in clase
    *       - clase statice --> innerclass*/

public interface PlayerEngine {
    public void  makeMove();

}
