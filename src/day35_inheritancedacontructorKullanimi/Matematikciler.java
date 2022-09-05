package day35_inheritancedacontructorKullanimi;

public class Matematikciler extends LOgretmen{

    Matematikciler (){
        System.out.println("Matematikciler parametresiz cons");
    }

    Matematikciler (String isim){
        this();
        System.out.println("Matematikciler parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("a");
    }
}
