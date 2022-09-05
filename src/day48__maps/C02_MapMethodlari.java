package day48__maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {

    public static void main(String[] args) {
        Map<Integer,String> sinifListMapp=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMapp);

        sinifListMapp.clear();
        System.out.println("cleardan sonra map:"+sinifListMapp);

        sinifListMapp=ReusableMethods.mapOlustur();

 //       System.out.println(sinifListMap.getOrDefault(104, "aradiginiz key yok"));
//        System.out.println(sinifListMap.getOrDefault(110,"aradiginiz key yok"));
        sinifListMapp.isEmpty();

        sinifListMapp.putIfAbsent(104,"Derya Can Developer");
        sinifListMapp.putIfAbsent(110,"Derya Can Developer");
  //      ReusableMethods.entryYazdir(sinifListMap);

        // sinifListMap e key olarak 106, value "Mevlut, Han, Tester" ekleyin
        //106 daha onceden varsa var olan degeri degistirmek istediginden emin misin yazsin
        // 106 nin oldugunu kontrol icin contain daha mantikli olabilir
        //

        System.out.println(sinifListMapp.putIfAbsent(106,"Mevlut Han Tester"));


        if(sinifListMapp.putIfAbsent(106,"Mevlut Han Tester")==null){
            System.out.println("Kayit basarili");
        }
        else{
            System.out.println("Eski degeri degistirmek istediginden emin misin");

        }

        sinifListMapp.putIfAbsent(115,"Cemil Kan SForce");
        ReusableMethods.entryYazdir(sinifListMapp);

        System.out.println(sinifListMapp.remove(106));
        System.out.println();
        System.out.println(sinifListMapp.remove(107, "Taha, Deniz, Tester"));
        System.out.println();
        ReusableMethods.entryYazdir(sinifListMapp);
        sinifListMapp.putIfAbsent(120,"Hasan Can SForce");

        sinifListMapp.replace(103, "Akif Emre Tester");

        ReusableMethods.entryYazdir(sinifListMapp);

        System.out.println(sinifListMapp.size());

    }
}
