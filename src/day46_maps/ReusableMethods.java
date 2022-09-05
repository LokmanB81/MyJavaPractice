package day46_maps;

import java.util.*;

public class ReusableMethods {


    public static Map<Integer, String> mapOlustur() {
        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Tester");
        sinifMap.put(105, "Emre, Kan, SForce");
        sinifMap.put(106, "Emre, Kan, JDev");
        sinifMap.put(107, "Taha, Deniz, Tester");
        sinifMap.put(108, "Emel, Kurt, QA");
        sinifMap.put(109, "Ahmet, Bay, QA");
        sinifMap.put(107, "Ayse, Bay, QA");

        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        System.out.println("Map sirali gosterim : \n");
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + "- " + each);
            sira++;

        }
    }

    public static List<String> isimSoyisimOlustur(Map<Integer, String> ogrenciMap) {
        List<String> sinifIsimSoyisimList = new ArrayList<>();
        String[] eachArr;
        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }
        return sinifIsimSoyisimList;

    }


    public static void bransdakiOgrenciler(Map<Integer, String> sinifListMap) {

        Map<String, List> branstakiOgrenciIsimleriMap = new HashMap<>();
        List<String> branstakiOgrenciIsimleriList=new ArrayList<>();
        List<String> bransIsimleri=new ArrayList<>();

        System.out.println("Branstaki Ogrenci Isimleri : \n");

        String [] eachArr;
        String bransIsmi;

        String branstakiOgrenci="";

        for (String each:sinifListMap.values()
             ) {
            eachArr=each.split(", ");
            bransIsmi=eachArr[2];

            if(!bransIsimleri.contains(bransIsmi)){
                bransIsimleri.add(bransIsmi) ;

            }
        }


                while (bransIsimleri.size()>0) {


                    for (String each : sinifListMap.values()
                    ) {
                        eachArr = each.split(", ");
                        bransIsmi = eachArr[2];
                        branstakiOgrenci = eachArr[0] + " " + eachArr[1];


                        if (bransIsimleri.get(0).equals(bransIsmi)) {
                            branstakiOgrenciIsimleriList.add(branstakiOgrenci);
                        }
                    }

                    branstakiOgrenciIsimleriMap.putIfAbsent(bransIsimleri.get(0), branstakiOgrenciIsimleriList);
                  //  System.out.println(branstakiOgrenciIsimleriMap);

                    Set<Map.Entry<String,List>> bransOgrenciIsimleriEntry=branstakiOgrenciIsimleriMap.entrySet();
                    for (Map.Entry each:bransOgrenciIsimleriEntry
                    ) {
                        System.out.println(each);

                    }


                    branstakiOgrenciIsimleriMap.clear();
                    bransIsimleri.remove(0);
                    branstakiOgrenciIsimleriList.clear();


                }

        }








    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();
        System.out.println("Bransataki ogrenci sayilari : ");
        Collection<String> valuesCollection = sinifListMap.values();
        String[] valueArr;
        String brans;
        Integer bransdakiOgrSayisi;

        for (String each : valuesCollection
        ) {
            valueArr = each.split(", ");
            brans = valueArr[2];

            if (!bransOgrSayiMap.containsKey(brans)) {
                bransOgrSayiMap.put(brans, 1);
            } else {
                bransdakiOgrSayisi = bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans, ++bransdakiOgrSayisi);
            }
        }

        System.out.println(bransOgrSayiMap);



    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer,String>> sinifListentrySet=sinifListMap.entrySet();
        for (Map.Entry each:sinifListentrySet
             ) {
            System.out.println(each);

        }
        }
    }





