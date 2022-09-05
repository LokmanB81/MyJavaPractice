package day11_to_day_15.day15_overLoading;

import day11_to_day_15.day13_methodCreation.C04_MethodCreation;

public enum C01_ReturnMethod { ;

    public static void main(String[] args) {
        // verilen iki sayiyi carpip
        // sonucu bize donduren metod

        int sayi1=10; int sayi2=50;

        int result=carpim(sayi1,sayi2);
       // System.out.println(carpim(sayi1,sayi2));
        System.out.println(result);
        C04_MethodCreation.topla(sayi1,sayi2);

    }

    public static int carpim(int sayi1,int sayi2) {
       // int result1=sayi1* sayi2;
        //return result1;
        return  sayi1*sayi2;
    }
}
