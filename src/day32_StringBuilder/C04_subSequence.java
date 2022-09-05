package day32_StringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        // bu method string donduruur. sb nin eski halini degistirmez...
        System.out.println(sb); // Kayra

        System.out.println(sb.subSequence(0, 3));
        System.out.println(sb); // Kayra

        StringBuilder sb1= new StringBuilder(sb.subSequence(0,3));
        System.out.println(sb1);// Kay
    }
}
