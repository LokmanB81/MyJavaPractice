package day38_Exception;

public class C01_Exception {
    public static void main(String[] args) {

        int a=100;
        int b=50;
int sayac=1;
            while(sayac<100){

                if(b==0){
                    System.out.println("payda 0 oldu.");
                }
                else {
                    System.out.println(a / b);

                }
                b--;
                sayac++;
            }



    }
}
