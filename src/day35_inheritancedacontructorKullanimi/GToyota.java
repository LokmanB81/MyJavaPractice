package day35_inheritancedacontructorKullanimi;

public class GToyota {

    GToyota(){
        System.out.println("Toyota parametresiz cons");
    }

    GToyota(String isim){
       /// super(isim); extends yok yazilamaz
        System.out.println("Toyota parametreli cons");
    }


}
