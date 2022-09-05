package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayElementEkleme {
    public static void main(String[] args) {
        /*Soru 5- Verilen bir array’e yeni bir element ekleyin*/


        String [] liste={"ayse gul","ahmed","kasim"};
        String eklenecekIsim="ali can";

        liste=elemanEkle(liste,eklenecekIsim);
        System.out.println(Arrays.toString(liste));

    }

    public static String[] elemanEkle(String[] liste, String eklenecekIsim) {
        String []yeniListe=new String[liste.length+1];

        for (int i = 0; i < liste.length; i++) {
            yeniListe[i]=liste[i];

        }
        yeniListe[yeniListe.length-1]=eklenecekIsim;




        return yeniListe;

    }
}
