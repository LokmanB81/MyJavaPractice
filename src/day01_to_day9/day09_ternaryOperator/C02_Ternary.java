package day01_to_day9.day09_ternaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        /*Kullanicidan bir sayi alin.
        Sayi pozitifse “Sayi pozitif” yazdirin,
        negatifse  sayinin karesini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        double sayi= scan.nextDouble();

       // String sonuc = sayi>0 ? "sayi pozitif" : (sayi*sayi);
        System.out.println( sayi>0 ? "sayi pozitif ": (sayi*sayi));

        }
    }

