package day01_to_day9.day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        /* C07_Scanner i tek seferde kullanicida alıp yapiniz

         */
        Scanner scan=new Scanner(System.in);
        System.out.println(" ad soyad yas giriniz\naralarda enter a basiniz");
        String ad=scan.nextLine();

        String soyad=scan.nextLine();

       int yas=scan.nextInt();

        System.out.println("girilen bilgiler :" + ad+ " ," + soyad+" ," + yas);
    }
}
