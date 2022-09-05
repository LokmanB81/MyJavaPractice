package day11_to_day_15.day15_forLoop;

public class C02_ForLoop {
    public static void main(String[] args) {
// input olarak verilen Strin gi terse cevirip yazdiran metod

        String input="Java gun gectikce kolaylasiyor";

        terstenYaz(input);


    }

    public static void terstenYaz(String input) {
       // String tersInput=input.substring(input.length()-1);
        String tersInput="";
        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);


        }
        System.out.println(tersInput);
    }


}


