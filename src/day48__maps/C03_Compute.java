package day48__maps;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfMapi=new HashMap<>();

        harfMapi.put("A",3);
        harfMapi.put("B",4);
        harfMapi.put("C",8);
        harfMapi.put("D",3);
        harfMapi.put("E",9);
        harfMapi.put("F",2);

        System.out.println(harfMapi);

        harfMapi.compute("A",(k,v) -> v*2);
        System.out.println(harfMapi);

        harfMapi.compute("D", (a,b)-> b*b);
        System.out.println(harfMapi);

        harfMapi.computeIfAbsent("C",(v)-> 30);
        System.out.println(harfMapi);

        harfMapi.computeIfAbsent("G",(v)-> 30);
        System.out.println(harfMapi);

        harfMapi.computeIfPresent("E", (v, k) -> k + 5);
        System.out.println(harfMapi);

        harfMapi.computeIfPresent("K", (v, k) -> k + 5);
        System.out.println(harfMapi);

    }
}
