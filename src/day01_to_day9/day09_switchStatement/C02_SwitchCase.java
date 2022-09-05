package day01_to_day9.day09_switchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanıcıdan gun ismi alın
        hafta ici veya hafta sonu yazın
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("gun ismi giriniz");
        String gunismi=scan.next();

       /* switch (gunismi){
            case   "pazartesi";
                System.out.println("hafta ici");
                break;
            case  "sali";
                System.out.println("hafta ici");
                break;
            case   "carsamba";
                System.out.println("hafta ici");
                break;
            case   "persembe";
                System.out.println("hafta ici");
                break;
            case   "cuma";
                System.out.println("hafta ici");
                break;
            case  "pazartesi";
                System.out.println("hafta ici");
                break;
            case   "cumartesi";
                System.out.println("hafta sonu");
                break;
            case  "pazar";
                System.out.println("hafta sonu");
                break;
            default :
                System.out.println("gecerli gun giriniz");

        */
        switch (gunismi){
            case   "pazartesi":

            case   "sali":

            case   "carsamba":

            case   "persembe":

            case   "cuma":
                System.out.println("hafta ici");
                break;

            case   "cumartesi":

            case  "pazar":
                System.out.println("hafta sonu");
                break;
            default :
                System.out.println("gecerli gun giriniz");


        }
    }
}
