package day01_to_day9.day07_basitIfStatements;

import java.util.Scanner;

public class OrnekSoru3 {
    public static void main(String[] args) {
        /* Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
        calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

                        if (yas<65){
                            System.out.println("emekli olamazsiniz");
                            System.out.println(65-yas + " yil daha calismalisin");
                        }
                            else {
                            System.out.println("emekli olabilirsiniz");
                        }


    }
}
