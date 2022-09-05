package day11_to_day_15.day11_stringManipulation;

import java.util.Scanner;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Hava bugun cok guzel";
        Scanner scan=new Scanner(System.in);
        System.out.println("aranacak karakteri giriniz");
        String harf=scan.next();
        //System.out.println(str.indexOf('v'));
        //System.out.println(str.indexOf('g'));
       // System.out.println(str.indexOf('h'));

        //System.out.println(str.indexOf("cok"));

        // istenilen indexten sonrasını kontrol etmek için
       //System.out.println(str.indexOf("u",(8+1)));

        //

        int ilka=str.indexOf(harf);
        System.out.println("ilk karakterin indexi "+ilka);
        int ikincia=str.indexOf(harf,ilka+1);

        if (ikincia==-1){
            System.out.println("ikinci bir "+ harf +" karakteri yok");
        }
        else{
            int ucuncua=str.indexOf(harf,ikincia+1);
            System.out.println("ikinci karakterin indexi "+ ikincia);
            if (ucuncua==-1){
                System.out.println("ucuncu bir "+harf+" karakteri yok");
            }else {
                System.out.println("ucuncu karakterin index i  "+ ucuncua);
            }
        }
    }
}
