package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(8);

        List<String> isimler=new ArrayList<>();
        isimler.add("erdal");
        isimler.add("zeki");
        isimler.add("ali");

        System.out.println(isimler.get(2)); // ali
        System.out.println(sayilar1.get(2)); // 8


    }
}