package day01_to_day9.day07_basitIfStatements;

import java.util.Scanner;

public class OrnekSoru4 {
    public static void main(String[] args) {
        /* eskenar ucgen mi degil mi*/
        Scanner scan = new Scanner(System.in);
        System.out.println("ucgen kenar uzunluklarını gir");
        double aKenarı = scan.nextDouble();
        double bKenarı = scan.nextDouble();
        double cKenarı = scan.nextDouble();

        if ((aKenarı == bKenarı) && (aKenarı == cKenarı) && (cKenarı == bKenarı))
       {
            System.out.println("bu bir ESKENAR UCGEN'dir");
        } else {
            System.out.println("bu bir ESKENAR UCGEN  degildir");
        }
    }
}
