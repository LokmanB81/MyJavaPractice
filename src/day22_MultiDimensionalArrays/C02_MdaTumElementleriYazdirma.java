package day22_MultiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        elementleriYazdir(sayilar);

    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                System.out.print(sayilar[i][j]+" ");

            }

        }
    }

}
