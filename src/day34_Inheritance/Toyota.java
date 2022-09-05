package day34_Inheritance;

public class Toyota {
    protected String marka="Toyota";
    protected String model="Belirtilmedi";
    protected String yakit="Belirtilmedi";

    protected void motor(){
        System.out.println("Toyota cevreci motorlar kullanir");
    }

    protected void aku(){
        System.out.println("Toyota modele gore aku kullanir");
    }
}
