package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        String harfler[] = {"Y", "V", "B", "D", "O", "G", "A"};

        String arananHarf = "A";
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));

        System.out.println(Arrays.binarySearch(harfler, arananHarf));
       System.out.println(C03_Contains.contains(harfler,arananHarf));
    }


}
