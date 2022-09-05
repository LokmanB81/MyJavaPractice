package day16_to_day20.day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    // soru 6
   /* Soru 6) Kullanicidan bir sifre girmesini isteyin.
    Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
    sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
    ve basarili sifre girilinceye kadar tekrar sifre isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false; // while dongusunu baslatabilmek icin
        int kontrol = 0;

        while (!sifreBasariliMi) {
            // sifre alalim
            System.out.println("lutfen sifre giriniz");
            sifre = scan.nextLine();
            // sifre icin gerekli 4 sart saglaniyor mu kontrol edelim
            // ilk harf kontrolu
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("ilk harf buyuk olmali");
            }

            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("son harf kucuk olmali");
            }

            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("sifre bosluk icermemeli");
            } else {
                kontrol++;
            }

        // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("sifre en az 8 karakter olmali");
            }
            if (kontrol == 4) {
                System.out.println("sifre tanimlandi");
                sifreBasariliMi = true; // donguden cikis sarti
            } else {
                System.out.println("islem basarisiz.yeni sifre olusturun");
                kontrol = 0;
            }
        }


    }}