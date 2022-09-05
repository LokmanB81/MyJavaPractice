package day10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

       /* String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0));

        System.out.println(str.toUpperCase().charAt(7));

        System.out.println(str.charAt(21));

        //System.out.println(str.charAt(22)); //.StringIndexOutOfBoundsException:
                                            // String index out of range: 22

        */

        String str1="   Java guzel  ";
        String str2=" 12345   ";

        System.out.println("ilk hali:"+str1);
        System.out.println(str1.length());
        System.out.println("bosluksuz hali:"+str1.trim());
        System.out.println(str1.length());
        System.out.println(str1);
        String str3=str1.trim();
        System.out.println(str3);
        System.out.println(str3.length());

    }


}
