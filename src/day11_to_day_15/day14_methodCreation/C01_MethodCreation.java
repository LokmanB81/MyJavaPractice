package day11_to_day_15.day14_methodCreation;

import day11_to_day_15.day13_methodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // input olarak verilen bir stringi tersten yazdıran bir metod
        // olusturalim
        String input="java";

        terstenYazdir(input);
        C04_MethodCreation.topla(20,10);
    }

    public static void terstenYazdir(String input){
        String tersInput= input.substring(3)+ input.substring(2,3)+
                input.substring(1,2)+input.substring(0,1);
        System.out.println("kelimenin tersten yazilisi: "+tersInput);

    }


}
