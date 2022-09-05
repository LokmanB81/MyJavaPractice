package day16_to_day20.day19_Scope;

public class C02_StaticVariables {
    static int statSayi=10;
    String isim="ali";
    char ch;

    static int degersizStaticVar;
    int degersizInstanceVariable;


    public static void main(String[] args) {

        System.out.println(statSayi);
        staticMethod();
        statSayi=15;
        System.out.println(statSayi);
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(statSayi);



    }

    public  static  void staticMethod(){

        System.out.println(statSayi);

    }

    public void staticOlmayanMethod(){

        System.out.println(statSayi);
        statSayi=20;

    }
}
