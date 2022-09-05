package day01_to_day9.day09_ternaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanicidan sayi alalım
        // sayi pozitifse sayiyi yazdır
        // sayi 0 veya negatifse bir sayi daha isteyip iki sayiyi carptıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);

        } else {
            System.out.println("bir sayi daha girinizsayi giriniz");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);


        }

    }
}
