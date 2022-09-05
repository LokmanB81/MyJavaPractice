package day16_to_day20.day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];

        //System.out.println(sayilar); [I@49e4cb85 ramdeki adresi gosterir
        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10; sayilar[0]=5; sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));

        String sinifList[]={"Ali","Ahmed","Ayse"};
        System.out.println(Arrays.toString(sinifList));

        sinifList[1]="Mustafa";
        System.out.println(Arrays.toString(sinifList));

        System.out.println(sinifList[1]);

    }
}
