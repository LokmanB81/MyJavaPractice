package day36_inheritancedaDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan hizmetliler  : "+30*saatUcreti*gunlukMesai+
                " maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan hizmetliler %30 indirimli " +
                "ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
         /*
        overriding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir.
        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise
        eger bir obje olusturulurken
        data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- Obje constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           ordada bulamazsak CTE verir
        3-   eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        aranan ozellik method ise
        degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdiriz
         */

        BMuhasebe yh1=new EYanHizmetliler();
        System.out.println();

        System.out.println(yh1.gunlukMesai);// muhasebe class 8
        System.out.println(yh1.saatUcreti);// muhasebe class 10
        yh1.maas();// yanhizmetler class - yanhizmetler class da overrride edilmis
        yh1.ozelSigorta();// muhasebe class
        yh1.sigorta(); // personel class
        System.out.println(yh1.isim); // personel class
        System.out.println(yh1.soyisim); // personel class
        System.out.println(yh1.departman); // personel class

       // System.out.println(yh1.issizlikSigorta); // aramaya muhasebeden basladik
        // bulamadik bu neenle cte

        BMuhasebe yh2=new EYanHizmetliler();
        System.out.println();
        System.out.println(yh1.gunlukMesai);// muhasebe class 8
        System.out.println(yh1.saatUcreti);// muhasebe class 10
        yh1.maas();// yanhizmetler class - yanhizmetler class da overrride edilmis
        yh1.ozelSigorta();// muhasebe class
        yh1.sigorta(); // personel class
        System.out.println(yh1.isim); // personel class
        System.out.println(yh1.soyisim); // personel class
        System.out.println(yh1.departman); // personel class

    }
}
