package day32_StringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Pay Attention Please!");
        System.out.println(sb.indexOf("Pay"));
        System.out.println(sb);

        System.out.println(sb.indexOf("e"));
        System.out.println(sb.indexOf("e",10));

        System.out.println(sb.lastIndexOf("e"));
        System.out.println(sb.lastIndexOf("e",10));
    }
}
