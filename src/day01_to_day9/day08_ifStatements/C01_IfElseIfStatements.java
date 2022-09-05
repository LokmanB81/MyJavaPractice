package day01_to_day9.day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
       /* Kullanicidan gun ismini yazmasini isteyin.
                Girilen isim gecerli bir gun ise gun isminin
    1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
                gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("gun ismi giriniz");
        String girilenGun=scan.nextLine().toLowerCase();

            if (girilenGun.equals("pazartesi")){
                System.out.println("Paz");
            }
            else if(girilenGun.equals("sali")){
                System.out.println("Sal");
            }
            else if(girilenGun.equals("carsamba")){
                System.out.println("Car");
            }
            else if(girilenGun.equals("persembe")){
                System.out.println("Per");
            }
            else if(girilenGun.equals("cuma")){
                System.out.println("Cum");
            }
            else if(girilenGun.equals("cumartesi")){
                System.out.println("Cum");
            }
            else if(girilenGun.equals("pazar")){
                System.out.println("Paz");
            }
            else{
                System.out.println("gecerli bir gun ismi giriniz");
            }


    }
}
