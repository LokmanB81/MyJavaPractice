package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        /*
        split() bir array method'u degil, String method'udur
        ama array dondurdugu icin bu konuda anlatiyoruz
        split() ile herhangi bir String'i istedigimiz sekilde parcalara bolup
        bir array haline getiriyoruz.
         */


        String str="java, ne kadar guzel.";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String[] kelimelere=str.split("e");
        System.out.println(Arrays.toString(kelimelere));

        String[] kelimelerr=str.split("");
        System.out.println(Arrays.toString(kelimelerr));


    }
}
