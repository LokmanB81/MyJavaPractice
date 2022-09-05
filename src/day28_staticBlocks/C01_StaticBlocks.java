package day28_staticBlocks;

public class C01_StaticBlocks {


    static int sayi;
    static {
        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("main method altindaki static block calisti");
        System.out.println(sayi);

    }
}
