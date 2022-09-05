package day01_to_day9.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /* kullanicidan ismini , soyismini ve yasini alip
       " girilen bilgiler = ... ad soyad yas" sklinde yazın
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad=scan.nextLine();

        System.out.println("soyadinizi giriniz");
        String soyad=scan.nextLine();
        System.out.println("yasinizi giriniz");
        double yas=scan.nextDouble();

        System.out.println("girilen bilgiler :" + ad+ " " + soyad+" " + yas);
    }
}
