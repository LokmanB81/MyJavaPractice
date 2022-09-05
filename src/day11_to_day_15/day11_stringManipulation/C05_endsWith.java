package day11_to_day_15.day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {

        String str="ah be Java";

        System.out.println(str.endsWith("ava"));
        System.out.println(str.endsWith("be Java"));
        System.out.println(str.endsWith("ah be Java"));
        System.out.println(str.endsWith(""));
    }
}
