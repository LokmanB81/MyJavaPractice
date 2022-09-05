package day33_Encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Ali");
        ogr1.setSoyisim("Yildiz");
        ogr1.setBrans("Kimya");
        System.out.println(ogr1.getIsim());
        System.out.println(ogr1.getSoyisim());
        System.out.println(ogr1.getBrans());
    }
}
