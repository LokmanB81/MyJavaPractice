package day31_TimeFormatter_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        // verilen iki int i toplayip
        //sonucu yazdiran bir methıd
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        toplaYazdir(sayi1,sayi2,sayi3);

    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("verilen uc sayinin toplami = "+(sayi1+sayi2+sayi3));
    }

    public static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("verilen iki sayinin toplami = "+(sayi1+sayi2));
    }
}
