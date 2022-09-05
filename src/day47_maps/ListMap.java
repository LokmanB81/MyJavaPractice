package day47_maps;

import day46_maps.ReusableMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {

    public static void main(String[] args) {
        Map<String, List> denemeListMap= new HashMap<>();

        List<String> isimler=new ArrayList<>();
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("cem");
        isimler.add("ayse");

        denemeListMap.put("JDev",isimler);

        System.out.println(denemeListMap);
    }
}
