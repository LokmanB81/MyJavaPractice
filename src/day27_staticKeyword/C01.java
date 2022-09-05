package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /* class level2da iki tur variable olusturubailiriz
        static (class) variable
        instance (obje) variable

        static variable lar tum classlardan kullanilabilr-irken,
        instance olanlar sadece  static olmayan method dan direk kullanilabilir.
        instance variable lara ulasmak icin obje olusturulmali

        instance variable lar obje variable oldugu icin herhnagi bir satirda instance variable in
        degerinin ne oldugunu bulmak icin obje olusturulan satirdan sonrasina bakilmali

        satic variable in herhangi bir satirdaki degerini bulmak icin class in basindan itibaren
        kontrol edilmeli
         */

        C01 obj1=new C01();
        System.out.println("obj1 in rakam degeri : "+ obj1.rakam);//5
        System.out.println("obj1 in sayi degeri : "+sayi);//10

        //rakam+=1 olmaz
        obj1.rakam+=1;
        sayi+=1;

        System.out.println("1 attirdiktan sonrra obj1 in rakam degeri : "+obj1.rakam); //6
        System.out.println("1 attirdiktan sonrra obj1 in sayi degeri : "+sayi);//11

        C01 obj2=new C01();
        System.out.println("obj2 in rakam degeri : "+ obj2.rakam);// 5
        System.out.println("obj2 in sayi degeri : "+sayi);// 11

        obj2.rakam++;
        obj2.sayi++;
        System.out.println("1 arttirdiktan sonra obj2 in rakam degeri : "+ obj2.rakam);// 6
        System.out.println("1 arttirdiktan sonra obj2 in sayi degeri : "+sayi);// 12


    }
}
