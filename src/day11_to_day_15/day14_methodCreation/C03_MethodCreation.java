package day11_to_day_15.day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // input olarak verilen isim ve soyad
        // ilk harfi buyuk geriye kalan harfler * olacak sekilde
        // I**** K*****

        String isim="Enes";
        String soyad="Bozkurt";
        isimGizle(isim, soyad);
        C01_MethodCreation.terstenYazdir("java");
    }

    public static String isimGizle(String isim, String soyad) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyad);


        return isim;
    }


}






