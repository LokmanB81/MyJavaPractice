package day11_to_day_15.day11_stringManipulation;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
                /*Kullanicidan email adresini girmesini isteyin,
        ,mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("e mail yaziniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println(" gmail adresi giriniz");
        }
        else if (email.endsWith("@gmail.com")){
            System.out.println("email kaydedildi");

        }else{
            System.out.println("yazımı kontrol ediniz");
        }

    }
}
