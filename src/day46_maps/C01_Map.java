package day46_maps;

import java.util.*;

public class C01_Map {
    public static void main(String[] args) {
        Map<Integer,String> sinifList=new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");
        sinifList.put(105,"Emre, Kan, SForce");

        System.out.println(sinifList);
        //{101=Ali, Can,JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());
        //[101, 102, 103, 104]
        System.out.println(sinifList.values());
        //[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size());//4

        //tum ogrencilerin isim ve soyisimlerini alt alta yazalim
        Collection<String> tumValueColl=sinifList.values();
        String [] eachArr;
        int sira=1;
        for (String each:tumValueColl
             ) {
            //System.out.println(each);
        eachArr=each.split(", ");
            System.out.println(sira+ "- "+eachArr[0]+" "+eachArr[1]);
        sira++;
        }

        // mapte bulunan ogrencilerin isim ve soyisimlerini birlestirerek
        // bir list halinde alalim
        List<String> sinifIsimSoyisimList=new ArrayList<>();

        for (String each:tumValueColl
             ) {
            eachArr = each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList);






    }

        }




