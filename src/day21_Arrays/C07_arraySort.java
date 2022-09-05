package day21_Arrays;

import java.util.Arrays;

public class C07_arraySort {
    public static void main(String[] args) {
        int sayilar[]={5,7,6,4,2,1,1,7,9};

        Arrays.sort(sayilar); // arrays class i kullanarak array i natural- sayilari buyukten kucuge
                            // string i alfabe sirasina gore siralama
        System.out.println(Arrays.toString(sayilar));

    }
}
