package day31_TimeFormatter_Varargs;

import static day31_TimeFormatter_Varargs.C02_Varargs.toplaYazdir;

public class C03_VarargsIleToplama {

    public static void main(String[] args) {
        /*
        verilen kac int olursa hepsini toplayip
        sonucu yazdiran bir method
         */

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=50;
        int sayi5=80;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);

        /*
        int... sayi  bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir
         */

    }
    public static void toplaYazdir(int... sayi){
        int toplam=0;
        int sayiAdedi= sayi.length;
        for (int each:sayi) {
            toplam+=each;
        }

        System.out.println("toplam = " +toplam+ ", "+sayiAdedi+" sayini nin toplami");

    }
}
