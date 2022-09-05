package day16_to_day20.day16_FoorLoop;

public class C01_forLoop {
    public static void main(String[] args) {

        // verilen pozif int sayisinin pozitif tam bolenlerini yazdiralim

        int input=120;

        for (int i = 1; i <=input; i++) {

            if (input % i == 0) {
                System.out.print(i + " ");
            }

        }


    }
}
