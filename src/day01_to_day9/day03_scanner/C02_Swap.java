package day01_to_day9.day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /* verilen iki sayı değişkeninin değerlerini
        değiştiren SWAP yapan program
        orn: sayi1=15 ve sayi2=30
        koddan sonra sayi1=30 ve sayi2=15
         */
        int sayi1=15;
        int sayi2=30;
        int sayi3=0;

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;
        System.out.println("sayi1:"+sayi1);
        System.out.println("sayi2:"+sayi2);
    }

}
