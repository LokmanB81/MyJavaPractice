package day31_TimeFormatter_Varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {
        EnUzunKelimeyiYazdir(5,"Ali","Ayse","Ismail","Babayigit","Jale","Abdulmuttalip","true");
    }

    public static void EnUzunKelimeyiYazdir(int kelimeSayisi,String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime) {

            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }


        }
        System.out.println("en uzun kelime : "+enUzunKelime);
    }
}
