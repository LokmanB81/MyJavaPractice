package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str="Hayat guzeldir";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1)); // son karakteri yazma
        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakter


        String str2="";// str2 ye hiçlik değeri atanır

        System.out.println(str2.length());
        String str3=null;// str3 deger atanmamıştır
        // System.out.println(str3.length()); hata verir



    }



}
