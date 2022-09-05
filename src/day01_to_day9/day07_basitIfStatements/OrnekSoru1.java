package day01_to_day9.day07_basitIfStatements;

import java.util.Scanner;

public class OrnekSoru1 {
   public static void main(String[] args) {
        /*kullanıcıdan dikdortgrn kenar uzunluklarını isteyin
        ve dıkdortgenin kare olup olmadığını yazdırın
         */
        Scanner scan=new Scanner(System.in);
       System.out.println("dikdortgen kenar uzunluklarını gir");
        double aKenarı=scan.nextDouble();
        double bKenarı=scan.nextDouble();

            if (aKenarı==bKenarı){
                System.out.println("bu bir KARE'dir");
            }
                else {
                System.out.println("bu bir KARE degildir");
            }

    }

}
