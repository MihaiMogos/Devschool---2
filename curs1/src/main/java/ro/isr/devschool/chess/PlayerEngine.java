package ro.isr.devschool.chess;

/**
 * Created by alin13 on 20.10.2016.
 */
public interface PlayerEngine {
    /*
        *Intr-o interfata putem avea:
            - atribute statice, publice si final
            - metode abstracte
            - de la java 8 metode default

        *final - desemneaza o constanta
               - gasit in: - metode(nu pot fi suprascrise)
                           - atribute(nu poate fi modificat + trebuie initializat la declarare sau in TOTI constructorii)
                           - clase(nu poate fi derivata/mostenita/extinsa)
                           - parametri de metode(nu isi pot modifica valoarea - daca sunt obiecte isi pot modifica starea)

        *static - desemneaza atribute si metode care apartin CLASEI de obiecte si nu unui obiect
                - blocuri statice(se folosesc fie in metode, fie in clase)
                - clase statice - inner class
     */
    public void makeMove();
}
