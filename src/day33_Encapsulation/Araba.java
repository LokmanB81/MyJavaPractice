package day33_Encapsulation;

public class Araba {

    String marka="Marka belirtilmedi";
   private String model="Model belirtilmedi";
   private String yakit="Elektrikli";// tum arab ise bu  elektrikli ise
    // bu variable'in degistirilmesine gerek yok


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

}
