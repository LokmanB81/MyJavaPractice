package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        // day25 Car class indan bir obje olusturalim

        Car car1=new Car();
        System.out.println(car1.fiyat);

        Araba araba1=new Araba();

        araba1.fiyat=50000;
        araba1.marka="Mercedes";
        araba1.yil=2020;
        araba1.model="C 180";

        System.out.println("Araba1 bilgileri :\nMarka : "+araba1.marka+ "\nModel :"+
                araba1.model+"\nYil : "+araba1.yil+"\nFiyat : "+araba1.fiyat);

Araba araba2=new Araba("BMW","5.20",2011,50000);

        System.out.println("Araba2 bilgileri :\nMarka : "+araba2.marka+ "\nModel :"+
                araba2.model+"\nYil : "+araba2.yil+"\nFiyat : "+araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,5000);
        System.out.println("Araba3 bilgileri :\nMarka : "+araba3.marka+ "\nModel :"+
                araba3.model+"\nYil : "+araba3.yil+"\nFiyat : "+araba3.fiyat);

        Araba araba4=new Araba("Kia","Rio",2009,5000);
        System.out.println("Araba4 bilgileri :\nMarka : "+araba4.marka+ "\nModel :"+
                araba4.model+"\nYil : "+araba4.yil+"\nFiyat : "+araba4.fiyat);
    }

    }
