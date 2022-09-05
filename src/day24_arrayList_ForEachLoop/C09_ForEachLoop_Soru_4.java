package day24_arrayList_ForEachLoop;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class C09_ForEachLoop_Soru_4 {
    public static void main(String[] args) {
        /* bir string olusturup string teki karakterleri
        for each loop kullanarak yazdiriniz
        ipucu:split
         */
        String str="Bugun gunlerden 17 Temmuz Pazar.";
        String[] strArr=str.split("");
        System.out.println(Arrays.toString(strArr));

        for (String each:strArr
             ) {
            System.out.print(each+" ");

        }

    }
}
