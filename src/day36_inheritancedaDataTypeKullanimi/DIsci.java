package day36_inheritancedaDataTypeKullanimi;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci() {
        System.out.println("Isciler  : "+30*saatUcreti*gunlukMesai+ " maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
       // DIsci isc1=new DIsci();
        BMuhasebe isc1=new BMuhasebe();
        /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */


        System.out.println(isc1.gunlukMesai);// muhasebe class 8
        System.out.println(isc1.saatUcreti);// muhasebe class 10
        isc1.maas();// muhasebe class
        isc1.ozelSigorta();// muhasebe
        isc1.sigorta(); // personel class
        System.out.println(isc1.isim); // personel class
        System.out.println(isc1.soyisim); // personel class
        System.out.println(isc1.departman); // personel class

        APersonel isc2=new DIsci();

        System.out.println();
       // System.out.println(isc2.gunlukMesai);// personel class da bu variable yok
       // System.out.println(isc2.saatUcreti);// personel class da bu variable yok
        isc2.maas();// muhasebe class -muhasebe class da override edilmis
       // isc2.ozelSigorta();// personel class da bu variable yok.aradigini bulamazsa CTE
        isc2.sigorta(); // personel class
        System.out.println(isc2.isim); // personel class
        System.out.println(isc2.soyisim); // personel class
        System.out.println(isc2.departman); // personel class
    }
}
