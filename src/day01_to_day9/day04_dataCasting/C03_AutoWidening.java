package day01_to_day9.day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
        /*int sayi1=12;
        float sayi2=sayi1;
        float sayi3=23;
        System.out.println(sayi3);*/
        byte sayi1=23;
        short sayi2=55;
        int sayi3=sayi1+sayi2;

        double sayi4=sayi1*sayi2;

        sayi4=(double)sayi2/sayi1;
        System.out.println(sayi4);
    }
}
