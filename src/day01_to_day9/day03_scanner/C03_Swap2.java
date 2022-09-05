package day01_to_day9.day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
       // swap sorusunu 3. degisken olmadan cozelim
       int sayi1=30;
       int sayi2=15;

       sayi1=sayi1+sayi2;
       sayi1=sayi2;
       sayi2=sayi1+sayi2;
        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
