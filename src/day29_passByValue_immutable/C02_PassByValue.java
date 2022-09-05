package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
          Birden fazla element iceren array ve arrayList gibi yapilarda da
          passByValue gecerlidir.
          Eger method'da array veya list'in kendisi degistirilirse
          passByValue ozelligi sebebiyle Java degisen degeri degil
          array veya list'in orijinal degerini alir
          Ancak array veya list degistirilmeden
          sadece icindeki elemanlar degistirilirse
          Java obje degismedigi icin(referans ayni),
          ayni array veya list'i bize dondurur
          ancak icindeki elementler degismis olacaktir.
         */
        /*
        verilen 4 ellemanli bir arrayi
        methoda gonderelim..method da yeni 3 elemanli bir arrray
        atayip bu yeni arraye rastgele 100 den kucuk 3 sayi atayalim
        methodda array i yazalim
        main method dada method call dan sonra da arrayi yazdiralim
         */
        int[] arr={3,5,8,10};
        System.out.println("arryin il hali : "+Arrays.toString(arr));
        C01_PassByValue.elemanDegistir(arr);
        System.out.println("eleman degistir metod sonrasi: "+Arrays.toString(arr));
        System.out.println("eleman degistir metod sonrasi main icinde: "+Arrays.toString(arr));

        arrayiDegistir(arr);
        System.out.println("main icinde :"+Arrays.toString(arr));

    }

    public static void arrayiDegistir(int[] arr) {
        arr=new int [3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);

        System.out.println("method icinde:"+ Arrays.toString(arr));
    }


}
