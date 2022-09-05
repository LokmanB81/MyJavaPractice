package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(8);

        System.out.println("array in boyutu: "+sayilar1.size());
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 8, 2]
        System.out.println("yeni boyutu: "+sayilar1.size());

        sayilar1.set(2,155);
        System.out.println(sayilar1); // [5, 3, 155, 2, 5, 3, 8, 2]

        System.out.println(sayilar1.set(0,12)); // 5 :silinen eleman

        System.out.println(sayilar1); // [12, 3, 155, 2, 5, 3, 8, 2]

        /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.
          eger eski elementi silmek istemiyorsak,
          add(index,deger) method'unu kullanabiliriz
          set() sildigi eski elementi de bize dondurur
         */

    }
}
