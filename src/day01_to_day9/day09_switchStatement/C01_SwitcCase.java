package day01_to_day9.day09_switchStatement;

import java.util.Scanner;

public class C01_SwitcCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1 ile 12 arası sayi giriniz");
        int sayi= scan.nextInt();
        switch(sayi){
            case 1:
                System.out.println("ay ismi; \nocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default :
                System.out.println("sayi 1 - 12 arası degil");


        }
    }
}
