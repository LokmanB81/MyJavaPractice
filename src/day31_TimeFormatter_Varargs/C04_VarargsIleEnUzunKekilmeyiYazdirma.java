package day31_TimeFormatter_Varargs;

public class C04_VarargsIleEnUzunKekilmeyiYazdirma {
    public static void main(String[] args) {
         EnUzunKelimeyiYazdir("Ali","Ayse","Ismail","Babayigit");
    }

    public static void EnUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime) {

            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }


        }
        System.out.println("en uzun kelime : "+enUzunKelime);
    }
}
