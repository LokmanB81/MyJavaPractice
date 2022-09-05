package day01_to_day9.day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfSoru6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0 ){
            System.out.println("toplam= "+ (sayi1+sayi2));
        }
        else if (sayi1<0 && sayi2<0){
            System.out.println("carpım= "+ sayi1*sayi2);
        }
        else {
            System.out.println("farklı işaretlerde islem yapamzsınız");
        }
    }
}
