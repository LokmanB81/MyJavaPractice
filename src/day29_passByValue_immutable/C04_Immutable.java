package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable :degistirilemez
        mutable : degistirilebilir

        en meshur immutable class : String 'dir...
         */
        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());

        str.toLowerCase();
        System.out.println(str);

        str.substring(3,5);
        System.out.println(str);

    }
}
