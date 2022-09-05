package day28_staticBlocks;

public class C02_PassByValue {

    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));
        System.out.println(satisFiyati);

        System.out.println(indirimliFiyat(satisFiyati));

    }

    public static double indirimliFiyat(double orjinalFiyat){

        // method umuz %10 indirim yapip main e dondursun

      double   satisFiyati=orjinalFiyat*0.9;
        return satisFiyati;
    }
}
