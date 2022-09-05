package day35_inheritancedacontructorKullanimi;

public class LOgretmen {

    LOgretmen (){

        System.out.println("Ogretmen parametresiz cons");
    }

     LOgretmen (String isim){
        this();
        System.out.println("Ogretmen parametreli cons");
    }
}
