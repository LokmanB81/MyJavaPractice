package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {

        // map olusturup yazdiralim
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        //map value leri sirali yazdiralim
        //ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // map teki ogrenci isimlerini ad soyad seklinde yazalim
    //    System.out.println(ReusableMethods.isimSoyisimOlustur(sinifListMap));

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
        //ReusableMethods.bransOgrenciSayisiYazdir(sinifListMap);

    //her branstaki ogrenci isimlerini brans ismi= isim soyisim,isim soyisim, .... seklinde yazalim
        ReusableMethods.bransdakiOgrenciler(sinifListMap);



    }

}
