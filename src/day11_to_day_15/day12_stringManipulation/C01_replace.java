package day11_to_day_15.day12_stringManipulation;

public class C01_replace {
    public static void main(String[] args) {

        String str=" Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));

        // hava kelimesini Java yapalım
        System.out.println(str.replace("h","J")
               .replace(" ",""));

        // gu zel yerine harika yapalım
        System.out.println(str.replace("guz el","harika"));

        // cumleyi replace ile bu gun hava cok guzel yapalım
        str=str.replace("bu gun","bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");
        System.out.println(str);
    }
}
