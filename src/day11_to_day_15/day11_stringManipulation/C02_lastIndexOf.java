package day11_to_day_15.day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime= "hava" ;
        // verilen kelime icin asagidaki şartlardan uygun olanı yazdirin
          //  -verilen kelime cumlede kullanilmamis
        // -verilen kelime sadece bir kere kullanilmis
        // -kelime cumlede birden fazla kullnilmis
        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

            if (kelimeIlkIndex==-1){
                System.out.println("kelime kullanilmamis");
            } else if (kelimeIlkIndex==kelimeSonIndex) {
                System.out.println("kelime bir kez kullanilmis");
            } else {
                System.out.println("birden fazla kullanilmis");
            }

    }
}
