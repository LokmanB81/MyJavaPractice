package day11_to_day_15.day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {

    public static void main(String[] args) {
        // kullanicidan sehir ismini ve dogum tarihini alip bunlari programda
        // kullanacagimiz formatta
        //sehir ismini programimizda buyuk harf olarak
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz..

        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println(sehir);
        System.out.println(tarih);


    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil= scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih= yil+"-";
        }else {
            System.out.println("gecerli bir yil giriniz (1900-2100)");
        }
        System.out.println("ay bilgisini giriniz-tam sayi olarak giriniz");
        int ay= scan.nextInt();
            if (ay<1 || ay>12){
                System.out.println("ay bilgisi 1-12 arasinda olmali");
            }else if (ay<10){
                tarih=tarih+"0"+ay+"-";
        }else {
                tarih=tarih+ay+"-";
        }
        System.out.println("gun bilgisi giriniz");
            int gun= scan.nextInt();
            if (gun<1 || gun>31){
                System.out.println("gun bilgisini 1-31 arası giriniz");

            } else if (gun<10){
            tarih=tarih+"0"+gun;
            }
            else{
                tarih=tarih+gun;
            }
            return tarih;

    }

    public static String sehirAl() {
        String sehirAdi="";

        Scanner scan=new Scanner(System.in);
        System.out.println("sehir adi giriniz");
        sehirAdi= scan.next().toUpperCase();
        return  sehirAdi;
    }

}









