package day47_maps;

import day46_maps.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C05_EntryUpDate {
    public static void main(String[] args) {
        // soyismi Can olanlarin bransini DataScience yapalim

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        // entryleri alalim

        Set<Map.Entry<Integer,String>> entrySeti=sinifListMap.entrySet();

        String entryValue;
        String []entryArr;
        for (Map.Entry<Integer,String> entry:entrySeti
             ) {
            entryValue=entry.getValue();
            entryArr=entryValue.split(", ");

                if(entryArr[1].equals("Can")){
                    entryArr[2]="DataScience";
                }
                entry.setValue(entryArr[0]+", "+entryArr[1]+", "+entryArr[2]);



        }
        System.out.println(sinifListMap);

        System.out.println(sinifListMap.keySet());

        Integer entryKey;
       List< Integer> entryKeyArr=new ArrayList();

        for (Map.Entry<Integer,String> entry:entrySeti
        ) {
           entryKeyArr.add(entry.getKey());
           entryKeyArr.set(0,114);



        }
        System.out.println("entry keyleri :"+entryKeyArr);


    }
}
