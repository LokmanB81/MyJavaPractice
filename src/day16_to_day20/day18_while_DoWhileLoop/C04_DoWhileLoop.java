package day16_to_day20.day18_while_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /* kullanicidan tam sayilar alin
        kullanici cift sayi girdigi surece sayilri yazdirin
        tek sayi girerse islemi durdurun
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        // while ile cozum
        /* looplarad kulanacagimiz variable lari loop tan once olusturmaliyiz
        while loop da looptan once olusturdugumuz bu variable a
        atadigimiz degeri iyi dusunmeliyiz
         */
        while(sayi%2==0){
            System.out.println("bir sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0){System.out.println("girilen sayi cift: "+sayi);
            }else{
                System.out.println("sayi tek");
        }

        }

        // do while ile

        do{
            System.out.println("bir sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0){System.out.println("girilen sayi cift: "+sayi);
            } else {
                System.out.println("sayi tek");
            }

        }while (sayi%2==0);
    }
}
