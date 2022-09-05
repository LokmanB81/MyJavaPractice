package day16_to_day20.day20_Arrays;

import java.util.Arrays;

public class C03_ArrayLength {
    public static void main(String[] args) {

        int sayilar[]={0,1,2,3};
        String harfler[]=new String[4];
        System.out.println("sayilar array in uzunlugu :"+sayilar.length);
        System.out.println("harfler array'in uzunlugu :"+harfler.length);
        System.out.println(Arrays.toString(harfler));

        // harflerin son elementini yazalim
        System.out.println(harfler[harfler.length-1]);
    }
}
