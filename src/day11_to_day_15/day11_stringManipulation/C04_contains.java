package day11_to_day_15.day11_stringManipulation;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {
    // kulanıcıdan alınan cumle 'buyuk' iceriyorsa tum cumle buyuk harfle
        // kucuk iceriyorsa tum cumle kucuk harfle yazılacak
        // ikisi de varsa buyuk-kucuk mu olacagini sectirsin

        Scanner scan=new Scanner(System.in);
        System.out.println("cumlenizi giriniz");
        String cumle=scan.nextLine();

        if (cumle.contains("buyuk") && cumle.contains("kucuk")){
            System.out.println("buyuk mu kucuk mu ysazilacagina karar ver\nbuyuk icin b kucuk icin k basiniz");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }
        else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }
        else {
            System.out.println("cumlede buyuk ve kucuk kelimesi yok");
        }
    }
}
