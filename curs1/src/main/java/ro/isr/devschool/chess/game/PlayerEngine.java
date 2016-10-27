package ro.isr.devschool.chess.game;

/**
 * Created by user on 20.10.2016.
 */

public interface PlayerEngine {

    public void makeMove();
}


/*
Intr-o interfata putem sa avem:
- atribute static, final, public
- metode public, abstract
- de la java8- metode default


- final- constanta,
      -metode- nu pot fi suprascrise
      -clase- nu pot fi derivate/mostenite/extinse
      -atribute- nu poate fi modificat- trebuie initializat la declarare sau in TOTI constructorii
      -parametri- nu isi pot modifica valoarea(adresa spre care pointeaza)

-static-atribute si metode care apartin CLASEI de obiecte si nu unui obiect
        -utilizat cel mai mult la metode utilitare
        -blocurile statice se folosesc fie in metode fie in clase (vezi ex HelloWorld)
        -clase statice- doar inner class-uri statice( pt a putea instantia o astfel de
           clasa chiar daca nu avem o instanta a clasei care o cuprinde
 */


