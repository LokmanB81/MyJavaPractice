package day01_to_day9.day07_basitIfStatements;

import java.util.Scanner;

public class OrnekSoru2If {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("gun isinlerinden birinin ilk harfini giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

            if (ilkHarf=='P'){
                System.out.println("Pazartesi , Persembe , Pazar");
            }
                if (ilkHarf=='S'){
                    System.out.println("Salı");
                }
                    if (ilkHarf=='C'){
                        System.out.println("Carsamba , Cumartesi");
                    }
                        if (!(ilkHarf=='P' || ilkHarf=='C' || ilkHarf=='S')) {
                            System.out.println("gecerli bir harf giriniz");
                        }
    }
}
