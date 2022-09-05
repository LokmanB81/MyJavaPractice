package day11_to_day_15.day14_methodCreation;

import day11_to_day_15.day13_methodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // verilen uc bbasamaklı bir sayinin
        // rakamlari toplamini yazdiran bir metod
        int input=555;
        rakamlarToplamı(input);
        C04_MethodCreation.topla(2,5);
        C01_MethodCreation.terstenYazdir("java");
    }

    public static void rakamlarToplamı(int input) {

        int rakamTopla= ( (input/100 ) + (input/10%10) +(input%10) );

       /* int birler=0;
        int rakamlarToplami=0;

        birler=input%10;
        rakamlarToplami+=birler;
        input/=10;

        birler=input%10;
        rakamlarToplami+=birler;
        input/=10;

        birler=input%10;
        rakamlarToplami+=birler;
        input/=10;

        System.out.println(rakamlarToplami); */
        System.out.println(rakamTopla);
    }


}



