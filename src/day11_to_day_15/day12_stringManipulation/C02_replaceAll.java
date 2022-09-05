package day11_to_day_15.day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        str=str.replace(" ","qazsx");// boşluklara cumlede olmayan
        // olmayacak 'qazsx' yapalım
        System.out.println(str);

        str=str.replaceAll("\\W","");//ozel karakterlerden kurtulduk
        System.out.println(str);
        str=str.replaceAll("\\d","");// sayilardan kurtulduk

        str=str.replace("qazsx"," "); // 7. satırdaki işlemi geri aldık
        System.out.println(str);


        //System.out.println(str.replaceAll("\\d","Bugun Java cok guzel"));
    }
}
