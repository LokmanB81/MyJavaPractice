package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N05_Iterator_Deneme {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

       int firstEleman=  liste.get(0)+3;
       liste.set(0,firstEleman);
        System.out.println(liste);



    }
}
