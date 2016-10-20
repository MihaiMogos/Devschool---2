package ro.isr.devschool.chess;

/**
 * Created by user on 10/20/2016.
 */

/*
Intr-o interfata putem avea:
- atribute statice, finale si publice

- metode abstracte
- de la Java 8 -> default

- final desemneaza o constanta:
a) metode ->nu pot fi suprascrise
b) atribute ->nu poate fi modificat (trebuie initializat fie la declarere fie in TOTI constructorii)
c) clase ->nu poate fi mostenita/derivata/extinsa
d) parametrii->devine immutable (nu e poate modifica referinta)

Exemplu clasic din JAVA care nu e immutable ->String;

- static desemneaza atribute si metode ce apartin unei CLASE si nu a unui obiect.
Un atribut->caracteristica a unui obiect (normale)
Metoda->actiune posibila a unui obiect (normale)

Cele statice tin de clase, nu de obiecte.

Clasa masina, nu -> Clasa BMW are marca statica
Binary search pentru colectii.

Blocurile statice se folosesc fie in metode, fie in clase.

Inner classes statice:
- Cand vreau sa ii fac o instanta fara clasa din care face parte.
 */
public interface PlayerEngine {

    public void makeMove();
}
