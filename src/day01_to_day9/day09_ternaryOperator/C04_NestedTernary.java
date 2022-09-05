package day01_to_day9.day09_ternaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        /*Kullanicidan bir harf isteyin
        kucuk harf ise consola “Kucuk Harf” ,
        buyuk harfse consola “Buyuk Harf”
        yoksa “girdiginiz karakter harf degil” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf= scan.next().charAt(0);

       // String sonuc = (harf >= 'a' && harf<='z')  ? ("kucuk harf") :
          //      ("buyuk harf veya gecersiz karaktar");

        String sonuc = (harf >= 'a' && harf<='z')  ? ("kucuk harf") :
                (harf>='A' && harf<='Z') ? "buyuk harf" : "gecersiz karakter";
        System.out.println(sonuc);
    }
}
