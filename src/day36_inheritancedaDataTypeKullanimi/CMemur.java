package day36_inheritancedaDataTypeKullanimi;

public class CMemur extends BMuhasebe{
   protected int saatUcreti=12;
   protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar  : "+30*saatUcreti*gunlukMesai+ " maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);// 12
        mmr1.maas();//Memurlar  : 3240 maas alir
        mmr1.ozelSigorta();//Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); // Tum personele sigorta yapilir -Personel class
        System.out.println(mmr1.isim); // Personel class
        System.out.println(mmr1.soyisim); // Personel class
        System.out.println(mmr1.departman); // personel class

        BMuhasebe mhsb1=new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */

        System.out.println(mhsb1.gunlukMesai);//8 muhasebe class
        System.out.println(mmr1.saatUcreti);// 10 muhasebe class
        mhsb1.maas();// muhasebe class
        mhsb1.ozelSigorta();// muhasebe class
        mhsb1.sigorta(); // personel class
        System.out.println(mhsb1.isim); // Personel class
        System.out.println(mhsb1.soyisim); // Personel class
        System.out.println(mhsb1.departman); // personel class


    }


}
