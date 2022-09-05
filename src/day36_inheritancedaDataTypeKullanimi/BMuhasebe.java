package day36_inheritancedaDataTypeKullanimi;

public class BMuhasebe extends APersonel{

    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Personel minimum : "+
                30*gunlukMesai*saatUcreti+ " maas alir");
    }
     protected  void ozelSigorta(){
         System.out.println("Isteyen personele %50 indirimli ozel sigorta yapilir");
     }
}
