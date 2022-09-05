package day11_to_day_15.day15_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

        C02_ForLoop.terstenYaz("zekeriya");

// 100 den 1 e kadar -100 ve 1  dahil- 8 e bolunebilen sayilari yazdiran
        for (int i = 100; i >=1 ; i--) {

            if(i%8==0){
                System.out.print(i+" ");
            }

        }

    }


}


