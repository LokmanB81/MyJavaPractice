package day11_to_day_15.day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        String inp="";

        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",6));
        System.out.println(input.isEmpty());
        System.out.println(inp.isEmpty());
        System.out.println(inp.startsWith("",0));
    }
}
