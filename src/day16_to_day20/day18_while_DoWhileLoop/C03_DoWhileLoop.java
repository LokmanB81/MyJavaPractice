package day16_to_day20.day18_while_DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        int sayi=7;
         while(sayi<10){
             System.out.print(sayi+" ");
             sayi++;
         }
        System.out.println();  sayi=7;
        do{
            System.out.print(sayi+" ");
            sayi++;
        }while (sayi<=10);
    }
}
