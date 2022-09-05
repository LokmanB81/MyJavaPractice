package day35_inheritancedacontructorKullanimi;

public class Child extends BParent {

    String isim="Belirtilmedi";
    protected String childKlupAdi="Child Klubu";
    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
       // AGrandParent gp1=new AGrandParent();

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        System.out.println(child1.grandpaKlupAdi);
        child1.parentKlupAdi="Child2";
        System.out.println(child1.parentKlupAdi);
        /*
          Java'da bir class'i kullanabilmek icin
          o class'dan obje olusturur, dolayisiyla
          o class'in constructor'ini kullanirdik
          Java inheritance'da parent class'lardaki
          ozellikleri kullanabilmek icin
          o class'larin constructor'larini
          otomatik calistiran bir yapi kurmustur.
          Ornegin biz child class'inda
          Child class'indan bir obje olusturmak istedigimizde
          Child cons. ini kullaniriz
          Java Child(){} gordugunde
          once parent'in constuctor'ini calistirmam lazim der
          buradan Parent cons'a gider
          Parent class'inda Parent(){} gorunce
          once bunun parent'inin yani Granparent cons.
          calismasi gerekir der
          Boylece extends keyword olmayan class'a kadar gider
          ve oradan baslayarak tum constructorlari
          asagi dogru calistirir
         */


    }
}
