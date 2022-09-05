package day01_to_day9.day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif 4 basamakli bir sayi gir");
        int sayi=scan.nextInt();
        int sayi1=sayi;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;

        birlerBasamagi=sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;

        birlerBasamagi=sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;

        birlerBasamagi=sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;

        System.out.println(sayi1 + " sayisinin rakamlar toplamı : "+rakamlarToplami);









    }
}
