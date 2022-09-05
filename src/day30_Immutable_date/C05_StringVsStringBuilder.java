package day30_Immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mi daha hizlidir..
        Bunun icin bir Sring olusturup sonuna 1000 tane . ekleyelim
        oncesi ve sonrasindaki zamani alip aradaki farki bulalim
        aynisini S>tringBuilder icin yapalim
         */
        String str="Java";
        LocalTime baslangic=LocalTime.now();
        for (int i = 0; i < 10000; i++) {
            str+=".";

        }
        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Zaman="+(bitis.getNano()-baslangic.getNano()));

        baslangic=LocalTime.now();

        StringBuilder sb=new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(".");

        }
        bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringBuilder Zaman="+(bitis.getNano()-baslangic.getNano()));
    }
}
