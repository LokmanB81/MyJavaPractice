package day11_to_day_15.day13_methodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {

        //String str="Java her gecen gun guzellesiyor";

        //System.out.println(str.substring(0,4)); // Java
//input olarak verilen iki int i toplayip sonucu yazdiran metod

        int input1=10; int input2=20;
        // metod 4 adimda olusturulur
        // 1. adim method call
        // argument eklemek gerekiyorsa ekleyelim
        // eger method un return type i void den farkli olacaksa
        // bir variable olusturup method call u assign edelim

        topla(25,15);

        //System.out.println("toplam= "+toplam);



    }

    public static void topla(int input1, int input2 ) {
        // 3. adim method deklerasyonda degistirilmesi gereken bolumleri degistir( access modifier,
        // return Type vb.. )
        // 4. adim eger return type void degilse return keyword u ve donecek degeri hesaplamaliyiz

        System.out.println("toplam= " + (input1 + input2));


    }
    }



