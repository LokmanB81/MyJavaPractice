package day16_to_day20.day19_Scope;

public class C03_ClassVariables {
  //  C02_StaticVariables.

    public static void main(String[] args) {

        C02_StaticVariables.staticMethod(); // 10
        System.out.println(C02_StaticVariables.statSayi); // 10
        System.out.println(C02_StaticVariables.degersizStaticVar); // 0

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10 -"metod icerisinde yeni deger 20
                                     // olarak atandi "
        System.out.println(obje1.isim); // mehmet
        System.out.println(obje1.ch); // '' -hiclik-
        System.out.println(obje1.degersizInstanceVariable);// 0

        System.out.println(C02_StaticVariables.statSayi);

    }
}
