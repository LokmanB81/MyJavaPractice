package day34_Inheritance;

public class Personel {
     /*
      Eger parent class olacak sekilde tasarladiginiz bir class varsa
      veya ilerde bu class'i parent yapmak isteyenler olabilir diyorsaniz
      variable ve method'larin a
      access modifier'ini protected
     */

   protected int persNo;
    protected String isim="Belirtilmedi";
    protected String departman="Belirtilmedi";


    public void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    public void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }
    public void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini " +
                "statusune gore alir");
    }

}
