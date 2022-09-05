package day11_to_day_15.day15_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // 1 den 5 e kadar -5 dahil- sayilari toplama
        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            toplam += i;

        }
        System.out.println("toplam= " + toplam);
        toplam = 0;

        for (int i = 10; i <= 20; i++) {
            toplam += i;

        }
        System.out.println("toplam= " + toplam);

        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {
            toplam += i;
        }
        System.out.println("toplam= " + toplam);

        toplam=0;
        for (int i = 30; i <=50 ; i++) {

            if(i%2==0){
                toplam += i;
            }

        }
        System.out.println("toplam= " + toplam);
        toplam=0;

        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam += i;
            }

        }
        System.out.println("toplam= " + toplam);

    }
}


