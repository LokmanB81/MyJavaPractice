package day11_to_day_15.day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        /*Kullanicidan email adresini girmesini isteyin,
        ,mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("e mail yaziniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")){ // gmail.com içermiyorsa
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("adresiniz kaydedildi");

        }else {
            System.out.println("yazdiginizi kontrol ediniz");
        }


    }
}
