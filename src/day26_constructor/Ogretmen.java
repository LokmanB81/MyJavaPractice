package day26_constructor;

public class Ogretmen {

    String isim="isim belirtilmedi";
    String soyIsim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans girilmedi";
    String yanBrans="Yan brans girilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
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
}
