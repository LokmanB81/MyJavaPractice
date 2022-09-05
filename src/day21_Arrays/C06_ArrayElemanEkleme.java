package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayElemanEkleme {
    public static void main(String[] args) {
        String [] takimListesi={"ali","talha","kemal"};
        String eklenecekIsim="mustafa";
        takimListesi=C05_ArrayElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));
    }
}
