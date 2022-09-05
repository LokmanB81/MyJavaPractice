package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*Soru 3- kullanicidan alinan bir ismin array'de olup olmadigini kontrol edip,
        bize true veya false sonucu donen bir method olusturun.

         */
        String isimler[]={"basak", "adem","ali","ayse","hayrullah","zeynep","enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("aranacak ismi giriniz");
        String aranacakIsim=scan.nextLine();
        boolean sonuc;

       sonuc=contains(isimler,aranacakIsim);

        if (sonuc){
        System.out.println("aranan isim array de var");
    } else{
            System.out.println("aranan isim array de yok");
        } }

    public static boolean contains(String[] isimler,String aranacakIsim) {
        boolean sonucMethod=false;
        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(aranacakIsim)){
                sonucMethod=true;
            }


        }


        return sonucMethod;
    }


}
