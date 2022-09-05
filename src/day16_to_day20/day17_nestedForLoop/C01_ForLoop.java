package day16_to_day20.day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen string deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf veren bir metod yapalım

        String input="Java her zaman guzel";

        tekrarsizYaz(input);
    }

    public static void tekrarsizYaz(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W",""); //Javaherzamanguzel
        System.out.print(input.substring(0,1)); // J
        benzersizInput+=input.substring(0,1);   // J

             for (int i = 1; i < islenecekKelime.length(); i++) {

       if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))) {
           System.out.print(", "+islenecekKelime.substring(i,i+1));
           benzersizInput+=islenecekKelime.substring(i,i+1);

       }

        }

        System.out.println("");
        System.out.println("input= "+input);
        System.out.println("istenilen sonuc= "+benzersizInput);
        }
    }
