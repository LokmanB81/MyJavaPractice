package day11_to_day_15.day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        // verilen isim ve soyismi ilk harfi buyuk
        // geriye kalanları * olacak sekilde degistrip
        // bize bu halini donduren bir metod
        // not:programin ilerleyen kisimlarinda isim ve soyismi bu seklde kullanmak istiyoruz

        String isim="Enes";
        String soyad="Bozkurt";

        String gizliIsim=isimGizle(isim,soyad);
        System.out.println(gizliIsim);
    }
    public static String isimGizle(String isim, String soyad) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*");

        //System.out.println(isim+" "+soyad);


        return isim+" "+soyad;
    }


}






