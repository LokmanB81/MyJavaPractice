package day21_Arrays;

public class ThreeDigitNumbers {

    public static void main(String[] args) {

        int [] numbers={25,5600,123,865,85,100,999,5234,500};

        System.out.print("3 Digit Numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>99 & numbers[i]<1000){
                System.out.print(numbers[i]+ " "); // 3 Digit Numbers : 123 865 100 999 500
            }
        }
    }
}
