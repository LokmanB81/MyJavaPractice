package day44_collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {
       /* Soru 3) Bir listedeki istenen sayi araliginda
       olmayan elementleri silen bir program yaziniz …                                         (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik
        20 ile 40 arasi (sinirlar dahil)
        output: [23,40]

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

        ListIterator lit1= sayilar.listIterator();
        int basSinir=20;
        int bitSinir=40;

        while(lit1.hasNext()){

            Integer temp=(Integer) lit1.next();

            if (temp<basSinir || temp>bitSinir){
                lit1.remove();
            }


        }
        System.out.println(sayilar);


    }
}
