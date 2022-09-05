package day38_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {


        String [] urunler={"Nutella","Cokokrem","Cay","Sut","Findik"};

        Scanner scan=new Scanner(System.in);
        //System.out.println("Urun kodu giriniz");
        int urunKodu=0;boolean sart=true;

        while (sart) {
            try {
                scan = new Scanner(System.in);
                System.out.println("Urun kodu giriniz");
                urunKodu = scan.nextInt();
              //  System.out.println("Aranan urun : " + urunler[urunKodu - 1]);
                sart = false;


            } catch (InputMismatchException deneme) {

                System.out.println("Urun indexi icin tamsayi giriniz." );//+
                       // "\nUrun kodu tekrar giriniz");
            }
        }

            try {
                System.out.println("Aradiginiz urun : "+urunler[urunKodu-1]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girilen kod listede yok."+
                        "\nUrun kodu en fazla "+urunler.length+" girilebilir.");///+
                       /// "\nUrun kodu tekrar giriniz");
            }



    }
}
