package day32_StringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();

        StringBuilder sb2=new StringBuilder("Java Candir...");

        StringBuilder sb3=new StringBuilder(10);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb1.append("Java");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append(" candir, bilen bilir.");
        System.out.println(sb1.length()); // 25
        System.out.println(sb1.capacity());// 34 -( (16*2)+2 )

       // sb3.append("bugun hava cok sicakti...");
        sb3.append("bugun bugun");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());




    }

}
