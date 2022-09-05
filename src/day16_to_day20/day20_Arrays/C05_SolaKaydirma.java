package day16_to_day20.day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {
        /*Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
         Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
        verilen 3 elemanlı bir arrayin
         */

        int sayilar[]={1,2,3,4,5};
        System.out.println(Arrays.toString(sayilar));

        int temp=sayilar[0];

        for (int i = 0; i < sayilar.length-1; i++) {
            sayilar[i]=sayilar[i+1];

        }
        sayilar[sayilar.length-1]=temp;
        System.out.println(Arrays.toString(sayilar));

        // array ilk drumuna getirelim

        temp=sayilar[sayilar.length-1];

        for (int i = sayilar.length-1; i > 0; i--) {
            sayilar[i]=sayilar[i-1];

        }
        sayilar[0]=temp;
        System.out.println(Arrays.toString(sayilar));

    }
}
