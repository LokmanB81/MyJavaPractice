package day01_to_day9.day04_dataCasting;

public class DataCasting_Soru1 {
    public static void main(String[] args) {
        byte sayi1=50;
        short sayi2; int sayi3; long sayi4;float sayi5; double sayi6;

        System.out.println(sayi1);
        sayi2=(short)sayi1;
        System.out.println(sayi2);
        sayi3=(int)sayi2;
        System.out.println(sayi3);
        sayi4=(long)sayi3;
        System.out.println(sayi4);
        sayi5=(float)sayi4;
        System.out.println(sayi5);
        sayi6=(double)sayi5;
        System.out.println(sayi6);
    }
}
