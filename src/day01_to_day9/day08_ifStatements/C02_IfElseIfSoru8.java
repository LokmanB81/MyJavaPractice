package day01_to_day9.day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfSoru8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("maas isteginizi giriniz");
        double maas=scan.nextDouble();

        if (maas<=0){
            System.out.println("0 dan buyuk bir deger giriniz");
        }
        else if(maas<60000){
            System.out.println("kabul edemem");
        }
            else if(maas<80000){
            System.out.println("dusunebilirim");
        }
            else{
            System.out.println("kabul ediyorum");
        }

    }
}
