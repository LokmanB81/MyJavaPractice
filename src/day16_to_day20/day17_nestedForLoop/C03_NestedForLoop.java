package day16_to_day20.day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        // verilen yukseklik ve boy degerine gore * lardan olusan bir
        // dikdortgen olusturalim
        // yukseklik : 3 , boy:4
       /* ****
        ****
        ****
        ****

        */
        int yuk=4;
        int boy=8;

        for (int i = 1; i <=yuk ; i++) {

            for (int j = 1; j <=boy ; j++) {

                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }
}
