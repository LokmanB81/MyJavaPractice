package day32_StringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin.");

        sb.append("?"); /// append istedigimiz string'i en sona ekler..
        System.out.println(sb);

        sb.append("java",2,4);
        System.out.println(sb);

        sb.insert(4," her seyi dusunmus, ");
        System.out.println(sb);

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);

    }
}
