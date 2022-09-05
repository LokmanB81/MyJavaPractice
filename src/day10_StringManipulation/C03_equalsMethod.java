package day10_StringManipulation;

public class C03_equalsMethod {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="ALi CAN";
        String str3="Ali Can"+"";
        String str4="Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str4));

        System.out.println(str3.equals(str5));
        System.out.println(str3==(str5));
    }
}
