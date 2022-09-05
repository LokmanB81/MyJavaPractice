package day37_overriding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("Supra modeli benzin kullanir");
    }

    @Override
    void motor() {
        System.out.println("Benzinli motor kullanir.");
    }
    /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir
         */
}
