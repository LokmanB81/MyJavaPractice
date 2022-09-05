package day01_to_day9.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini isteyin
        // girilen ismi
        // isminiz: ..... seklinde yazdırın
        Scanner scan =new Scanner(System.in);
        System.out.println("isminizi giriniz");

        String girilenIsim=scan.next();
        System.out.println("isminiz: "+girilenIsim);
    }
}
