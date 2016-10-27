package ro.isr.devschool.chess;

/**
 * Created by Mucefix on 20/10/16.
 */
public interface PlayerEngine {
    String test = "avc";
    /*
        *intr-o interfata putem avea:
        - atribute statice, final, publice
        - metode abstracte
        - de la java 8 metode default

        *final - desemneaza o const
        - metode --> nu poate fi suprascrisa
        - atribute --> nu poate fi modificat(trebuie declarat ori la initializare ori in TOTI constructorii
        - clase --> nu poate fi derivata/mostenita/extinsa
        - parametri --> nu isi pot modifica valoarea(daca sunt obiecte isi pot modifica starea)

        *static - desemneaza atribute si metode care apartin Clasei de obiecte si nu unui obiect
                - blocuri statice --> se folosesc fie in metode fie in clase
                - clase statice --> innerclass
     */
    public void makeMove();
}
