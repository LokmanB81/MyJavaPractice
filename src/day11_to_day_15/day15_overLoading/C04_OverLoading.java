package day11_to_day_15.day15_overLoading;

public class C04_OverLoading {
    public static void main(String[] args) {

       
        topla(5,7); // 12
        topla(5.2,3);// 8.2
        topla(5.2,3.8);// 9
        topla(5,3.6);

    }
    public static void topla(int sayi1,int sayi2){

        System.out.println("iki integerin toplami= "+(sayi1+sayi2));
    }

    public static void topla(double sayi1,int sayi2){
        System.out.println("bir double ve integerin toplami= "+(sayi1+sayi2));
    }

    /*public static void topla(int sayi1,double sayi2){
        System.out.println("bir integerin ve bir double in toplami= "+(sayi1+sayi2));
    }*/
    public static void topla(double sayi1,double sayi2){

        System.out.println("iki double in toplami= "+(sayi1+sayi2));
    }
}
