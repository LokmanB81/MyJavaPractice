package day32_StringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip bize donduren bir method

        String input="Hey gidi for loop gunleri"; // soru:integeri reverse yapar mi?

        String tersInput=tersineCevir(input);
        System.out.println(tersInput);
    }

    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();


    }
}
