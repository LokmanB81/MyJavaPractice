package day37_overriding;

public class EToyota extends DAraba{

    @Override
    void marka() {
        /*super.marka();
        eger hem overridden hem de overriding method'un calismasini
        istersek ilk satira super.marka() yazabiliriz...
         */
        System.out.println("markamiz Toyota");
    }

    void motor(){
        System.out.println("Toyota araclar Toyota motor kullanir.");
    }
}
