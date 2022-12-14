package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // array'deki tum elemanlari inceleyelim, tek sayi olanlari list'e atayalim

        for (int each: arr  // gelecek datalarin turu, loop icinde ne isim verdigim, neren aldigim
        ) {                 //          int                         each                arr
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
    // array ve listteki tum elementleri isleyeceksek  for each loop kullanmak uygun olur