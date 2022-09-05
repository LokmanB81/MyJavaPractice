package day01_to_day9.day07_basitIfStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    /* emeklilik ile ilgili soruda yanlıs bilgi girisinin engellenmesi

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

            if (yas<0){
                System.out.println("gecerli bir yas giriniz");
            }
       else if (yas<65){
            System.out.println("emekli olamazsiniz");
            System.out.println(65-yas + " yil daha calismalisin");
        }
        else {
            System.out.println("emekli olabilirsiniz");
        }

    }
}
