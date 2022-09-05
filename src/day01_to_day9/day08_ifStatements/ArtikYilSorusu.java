package day01_to_day9.day08_ifStatements;

import java.util.Scanner;

public class ArtikYilSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil= scan.nextInt();
//2024
         if (yil %4 !=0){
             System.out.println("artik yil degil");
         }
                else if(yil %100 !=0){
                     System.out.println("artik yil");
                }
                         else if(yil %400 !=0){
                        System.out.println("artik yil degil");
                }
                        else{
                     System.out.println("artik yil");
         }
    }
}
