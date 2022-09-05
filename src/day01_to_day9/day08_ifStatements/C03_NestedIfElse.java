package day01_to_day9.day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        /* emeklilik programı
        e erkek , k kadın degiskenleri olacak
        farklı giriste hata verecek
        kadınlarda yas sınırı 60 , erkeklerde 65 olacak
        negatif ve 80 den buyuk girilirse hata verecek
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyet giriniz " +
                "\n kadın icin k , erkek icin e giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("yas giriniz");
        double yas = scan.nextDouble();


        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsınız");
            } else {
                System.out.println("emekli olabilirsiniz");
            }
        }

            if (cinsiyet == 'K') {
                if (yas < 0 || yas > 80) {
                    System.out.println("gecerli yas giriniz");
                }
                else if (yas < 60) {
                    System.out.println("emekli olamazsınız");
                }
                else {
                    System.out.println("emekli olabilirsiniz");
                }
            }

        }
    }

