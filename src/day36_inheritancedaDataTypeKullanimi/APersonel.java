package day36_inheritancedaDataTypeKullanimi;

public class APersonel {

   protected String isim="isim belirtilmedi";
    protected String soyisim="soyisim belirtilmedi";
   protected String departman="departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personel  maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personele sigorta yapilir");
    }
}
