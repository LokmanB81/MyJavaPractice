package day16_to_day20.day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen inputa gore * lardan olusan bir ucgen olusturalim
        ornek input =4 ise
        *
        * *
        * * *
        * * * *
         */
        int input=4;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();


        }


    }
}