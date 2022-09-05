package day01_to_day9.day07_basitIfStatements;

import java.util.Scanner;

public class OrnekSoru2 {
    public static void main(String[] args) {
        /*girilen karakterin harf olup olmadıgını belrleme*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");

        char harf=scan.next().charAt(0);

            if ( (harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("girilen karakter bir HARF 'tir");
        }
            else {
            System.out.println("girilen karakter HARF DEGİLDİR");
        }
    }
}
