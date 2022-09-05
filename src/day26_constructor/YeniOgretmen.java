package day26_constructor;

public class YeniOgretmen {

    String isim="isim belirtilmedi";
    String soyIsim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans girilmedi";
    String yanBrans="Yan brans girilmedi";

    public YeniOgretmen() {
    }

    public YeniOgretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public YeniOgretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim : " + isim +
                        "\nsoy Isim : " + soyIsim +
                        "\ndogum Tarihi : " + dogumTarihi +
                        "\nbrans : " + brans +
                        "\nyan Brans : " + yanBrans ;
    }

    public static void main(String[] args) {

        YeniOgretmen ogretmen1=new YeniOgretmen();
        System.out.println("ogretmen1 : "+ogretmen1);
        System.out.println();

        YeniOgretmen ogretmen2=new YeniOgretmen("Emre","Akdogan","1/1/2001","Matematik","Fizik");
        System.out.println("ogretmen2 :"+ogretmen2);
        System.out.println();

        YeniOgretmen ogretmen3=new YeniOgretmen("Cavidan","Kabinkara","1/1/2000");
        System.out.println("ogretmen3 : "+ogretmen3);
        System.out.println();
    }
}




