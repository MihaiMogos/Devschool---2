package ro.isr.devschool.chess;

/**
 * Created by Computer on 10/20/2016.
 */
public interface playerEngine {
    /*
     intr-o interfata putem avea:
      -atribute statice, final, publice
      -metode abstracte
      -java8: default - o sa-l puna pe client sa le implementeze

      *****
      final - desemneaza o constanta:
      -metode --> nu pot fi suprascrise
      -atribute --> nu se modifica trebuie declarat ori la initializare ori in TOTI constructorii
      -clase --> nu poate fi derivata/mostenita/extinsa
      -parametrii --> nu isi pot modifica valoarea(daca sunt obiecte isi pot modifica starea) - imutable(nu-si poate modifica rederinta)

      static - desemneaza atribute si metode care apartin clasei de obiecte si unui obiect
      -blocuri statice -> se folosesc fie in metode fie in clase
      - clase statice --> innerclass

     */

    public void makeMove();
}
