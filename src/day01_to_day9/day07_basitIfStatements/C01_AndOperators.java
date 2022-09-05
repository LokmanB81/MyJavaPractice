package day01_to_day9.day07_basitIfStatements;

public class C01_AndOperators {
    public static void main(String[] args) {

        int a=10; int b=15; int c=20;

        System.out.println(a>0 && b<20 && c>=10);

        System.out.println(a<0 && b<20 && c>=b);
        // tek false sart saglandiginda
        // java diger sartları kontrol etmez

        System.out.println(a<0 & b<20 & c>=b);
        // butun kosulları kontrol ederek sonuc uretir

    }

}
