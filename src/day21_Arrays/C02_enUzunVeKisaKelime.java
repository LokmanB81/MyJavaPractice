package day21_Arrays;

public class C02_enUzunVeKisaKelime {
    public static void main(String[] args) {
       // Soru 2- Verilen String bir array’de en uzun ve en kisa
        // String’leri yazdiran bir method olusturun
        String isimler[]={"Ali","mehmet", " ayse","mustafa","nilufer","hayrullah"};

        enUzun(isimler);
        enKisa(isimler);
    }

    public static void enKisa(String[] isimler) {
        String kisaIsim=isimler[0];
        for (int i = 1; i < isimler.length ; i++) {

            if (isimler[i].length()<kisaIsim.length()){
                kisaIsim=isimler[i];

            }


        } System.out.println("en kisa isim : "+kisaIsim);
    }

    public static void enUzun(String[] isimler) {
        String uzunIsim=isimler[0];
        for (int i = 1; i < isimler.length ; i++) {

            if (isimler[i].length()>uzunIsim.length()){
                uzunIsim=isimler[i];

            }


        } System.out.println("en uzun isim : "+uzunIsim);
    }
}
