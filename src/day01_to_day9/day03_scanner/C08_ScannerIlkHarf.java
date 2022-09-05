package day01_to_day9.day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
         char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println(" ilk harf: "+ilkHarf);

    }
}
