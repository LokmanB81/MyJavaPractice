package day01_to_day9.day07_basitIfStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("gun isimi giriniz");

        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("girilen gun HAFTASONU");
        }

                if (girilenGun.equals("pazartesi")  || girilenGun.equals("sali") ||
                girilenGun.equals("carsamba") || girilenGun.equals("persembe") ||
                        girilenGun.equals("cuma")) {
                    System.out.println("girilen gun HAFTAICI");
                }

                                if (!(girilenGun.equals("pazar") || girilenGun.equals("cumartesi")||
                                        girilenGun.equals("pazartesi")  || girilenGun.equals("sali") ||
                                        girilenGun.equals("carsamba") || girilenGun.equals("persembe") ||
                                        girilenGun.equals("cuma"))){
                            System.out.println("gecerli bir gun ismi giriniz");
                        }

    }
}
