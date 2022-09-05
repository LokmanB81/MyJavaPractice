package day16_to_day20.day18_while_DoWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        // do while loop soru 1-) 9 dan 190 a kadar 7 nin kati olan sayilari yazdiran

        int bas = 9;
        int son = 190;
        int temp = bas;

        // while ile
        while (temp < son) {

            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }temp++;
        }

        // do while ile
        System.out.println("");
        temp = bas;
        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;
        } while (temp < son) ;
        }
    }
