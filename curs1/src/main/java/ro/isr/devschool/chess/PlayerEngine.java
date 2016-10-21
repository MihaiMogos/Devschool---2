package ro.isr.devschool.chess;

/**
 * Created by Valentin on 10/20/2016.
 */
public interface PlayerEngine {
    /*
    Intr-o interfata putem avea:
    - atributele din interfata sunt oblig. publice, statice si final
    - metode abstracte
    - de la javaa 8 metode default: daca tu nu ii dai o implementare, primesti tu o implementare
     */

    /*
    finalul desemneaza o constanta
    final in 3 situatii:
    * metode-> nu pot fi suprascrise
    * atribute = > nu poate fi modificate (trebuie initializat ori in TOTI constructorii ori la initializare)
    * claase: => Nu poate fi derivata/mostenita/extinsa
    * parametrii de la metode => nu isi pot modifica valoarea sau referinta
     */

    /*
    static: atribute si metode care apartin CLASEI de obiecte si nu unui obiect

    Blocuri statitice: Se folosesec fie in metode fie in clase

    Clase statistice. InnerClass
     */

    void makeMove();
}
