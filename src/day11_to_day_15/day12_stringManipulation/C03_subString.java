package day11_to_day_15.day12_stringManipulation;

public class C03_subString {
    public static void main(String[] args) {
        String isim="lokman";
        String soyad="bayrak";
        String kartNo="1234 5678 8910 4563";

        System.out.println(isim.substring(3));//man
        System.out.println(soyad.substring(soyad.length()-3));// rak

        System.out.println(isim.substring(2,4));//km

        // isim ve soyadin ilk harfleri buyuk harf kalanları *
        // kart nonun ilk 4 u gorunsun, kalanı * gorunsun
         String isimIlkHarf=isim.substring(0,1).toUpperCase();
         String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyadIlkHarf=soyad.substring(0,1).toUpperCase();
        String soyadGeriyeKalanlar=soyad.substring(1).replaceAll("\\w","*");

        String kkilk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyadIlkHarf+soyadGeriyeKalanlar+"\n"+
                kkilk4+kkGeriyeKalanlar);




    }
}
