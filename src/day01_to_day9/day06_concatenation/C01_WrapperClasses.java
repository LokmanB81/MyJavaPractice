package day01_to_day9.day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str="Java ile ne guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi=true;

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrenciNo="407";
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 5 basamakli sifre giriniz");

        String sifre=scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("girilen sifre "+ sifre );
        System.out.println("Integer sifre "+ sifreSayi);







    }
}

