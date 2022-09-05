package day16_to_day20.day16_FoorLoop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {

        //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve
        // aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir metod  yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("baslangic ve bitis degerlerini poz tam sayi olarak giriniz");
        int s1= scan.nextInt();
        int s2= scan.nextInt();

        araDegertoplama(s1,s2);

        }

    private static void araDegertoplama(int s1, int s2) {
        int toplama=0;
        if (s1<=s2){

        for (int i= s1; i <= s2; i++)
        toplama+=i;
        } else {
            for (int i = s2; i <=s1 ; i++) {
                toplama+=i;

            }

            }
        System.out.println(toplama);
        }

        }







