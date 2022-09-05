package day16_to_day20.day16_FoorLoop;

public class C02_forLoopHatalar {
    public static void main(String[] args) {

        // verilen pozif int sayisinin pozitif tam bolenlerini yazdiralim

       // int input=20;

        for (int i = 0; i <-10; i++) { // baslangic noktasindan sonra
                                        // bitis sartından uzaklasiyorsak sonsuz loop olusur
            System.out.print(i);

        }

        for (int i = 0; i >5 ; i++) {   // eger ilk deger icin bile bitis sarti saglanmiyorsa
            System.out.println(i);      // for loop calisir ama loop body calismaz

        }


    }
}
