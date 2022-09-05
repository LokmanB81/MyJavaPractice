package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /* aranan eleman array icinde yoksa
        binary search - ve elemanın eger olsaydı olacagi sirayi dondurur.

         */


        int sayilar[]={3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.binarySearch(sayilar,4));// 1
        System.out.println(Arrays.binarySearch(sayilar,15));// 4
        System.out.println(Arrays.binarySearch(sayilar,11));//-5
        System.out.println(Arrays.binarySearch(sayilar,6)); // -3
        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1



    }
}
