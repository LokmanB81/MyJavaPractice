package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); // [5,3,7]

        sayilar.add(2,10);
        System.out.println(sayilar); // [5,3,10,7]
    }
}
