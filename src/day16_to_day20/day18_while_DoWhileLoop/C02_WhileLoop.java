package day16_to_day20.day18_while_DoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

    /* soru 7 : kullanicidan sayi alip
    bu sayinin rakmlari toplamini yazdirin
     */
        int input=65432;
        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while (temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;
        }
        System.out.println(input+" sayisinin rakamlar toplami : "+rakamlarToplami);

}
}