package day47_maps;

import day46_maps.ReusableMethods;

import java.util.*;

public class OgrenciIsimleriEntryIle {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
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
           // System.out.println(branstakiOgrenciIsimleriMap);

            Set<Map.Entry<String,List>> bransOgrenciIsimleriEntry=branstakiOgrenciIsimleriMap.entrySet();
            for (Map.Entry each:bransOgrenciIsimleriEntry
            ) {
                System.out.println(each);

            }

            //   Set<Map.Entry<String,List>> branstakiOgrencilerEntry=branstakiOgrenciIsimleriMap.entrySet();
            branstakiOgrenciIsimleriMap.clear();
            bransIsimleri.remove(0);
            branstakiOgrenciIsimleriList.clear();


        }

    }
    }




