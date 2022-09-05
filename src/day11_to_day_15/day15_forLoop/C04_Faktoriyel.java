package day11_to_day_15.day15_forLoop;

public class C04_Faktoriyel {
    public static void main(String[] args) {
        
       // input olarak verilen bir int sayi icin faktoriyel
        // hesaplayip yazdiran bir metod
        // verilen sayi  negatif yada 20 den buyuk olursa
        // " girilen syinin faktoriyeli hesaplanamıyor" uyarisi versin

         int input=25;
         faktoriyel(input);

        }

    public static void faktoriyel(int input) {
        int faktoriyel=1;

        if (input<0 || input>20){
            System.out.println("hesap yapilamiyor");
        } else if (input==0){
            System.out.println("0 faktoriyel= 1 dir");
        }else{
            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;

            }
            System.out.println(faktoriyel);
        }
    }

}





