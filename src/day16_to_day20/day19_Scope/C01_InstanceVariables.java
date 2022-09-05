package day16_to_day20.day19_Scope;

public class C01_InstanceVariables {
    /*
    class icersinde heryerden kullanmak istedigimiz variable lari
    class level da -class icinde ama metodlarin disinda-
    genellikle class level variable lar classin basina olusturulur-sart degil-

     */

int instSayi=20;// static olmayip class level da oldugu icin instance variable'dir.
    public static void main(String[] args) {
        int sayi=10;
        /* System.out.println(instSayi);

         */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println(obje1.instSayi);
        obje1.instSayi=30;
        System.out.println(obje1.instSayi);
        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println(obje2.instSayi);
        obje2.instSayi=25;
        System.out.println(obje2.instSayi);
        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println(obje3.instSayi);
    }


    public static void staticMethod(){
       // System.out.println(sayi);
       /*
       bir metodun icerisinde olusturulan variable sadece
       o metod icerisinde kullanilabilir (loal variables)
        */
       // instSayi=45;
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println(obje4.instSayi);
    }

    public void staticOlmayanMethod(){
        System.out.println(instSayi);

    }
}
