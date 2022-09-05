package day35_inheritancedacontructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    protected String grandpaKlupAdi="Grandpa Klubu";
    /*
      Her class'da gorunmese bile bir constructor vardir
      Bu class'dan obje olusturmak istedigimizde
      default constructor devreye girecektir.
      Default constructor'i gozlemleyemeyecegimiz icin
      onun yerine kullanilabilecek parametresiz constructor olusturalim
     */


    AGrandParent(){
        System.out.println("Grandpa constructor calisti");
    }
}
