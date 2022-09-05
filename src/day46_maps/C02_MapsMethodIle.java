package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {

    public static void main(String[] args) {

       Map<Integer,String> ogrenciMap=ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);

        //value'lari sirali olarak yazdiralim
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);


        // isim ve soyisimleri list olarak alalim
        List<String> sinifIsimSoyisimList=ReusableMethods.isimSoyisimOlustur(ogrenciMap);
        System.out.println(sinifIsimSoyisimList);

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
       // List<String> bransIsmiList=ReusableMethods.branstakiOgrenciSayisi(ogrenciMap);
    }
}
