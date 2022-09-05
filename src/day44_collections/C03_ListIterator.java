package day44_collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {
        /*Soru 5) (iterator ile index kullanimina ornek)
        Bir listedeki ilk n elemani iterator kullanarak 5 artirin.

 Orn :  list : [2,13,56,23,45,14,40]
 artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]

         */
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(22);
        sayilar.add(56);
        sayilar.add(13);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        System.out.println(sayilar);
        int istElemanSayisi=3;

        ListIterator lit1= sayilar.listIterator();
        int temp;

        while (istElemanSayisi>0){
            temp=(Integer) lit1.next()+5;
            lit1.set(temp);
            istElemanSayisi--;
        }
        System.out.println(sayilar);
    }
}
