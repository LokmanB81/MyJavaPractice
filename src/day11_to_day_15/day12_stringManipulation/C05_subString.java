package day11_to_day_15.day12_stringManipulation;

public class C05_subString {
    public static void main(String[] args) {
        //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
                String input= "Kaya";
        String tersInput= input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);

        StringBuilder obj=new StringBuilder(input);
        System.out.println(obj.reverse());

    }

}