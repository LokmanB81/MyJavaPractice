package day16_to_day20.day18_while_DoWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
// while loop soru 4

        char ilkHarf='f';
        char sonHarf='t';
        String buyult="";

        char temp=ilkHarf;

        while(temp<=sonHarf){
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult+" ");
            temp+=1;

        }
    }
}
