package day44_collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
      /*  Soru 4) Bir listedeki elementleri iterator kullanarak
      sondan basa dogru yazdirin
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
        ListIterator li1= sayilar.listIterator();

        while (li1.hasNext()){
            li1.next();
        }

        while (li1.hasPrevious()){
            System.out.print(li1.previous()+" ");
        }
    }
}
