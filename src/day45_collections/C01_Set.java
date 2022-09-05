package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array deki tekrar eden elemntleri
        //silip , tekrarsiz halini array e atan bir kod

        int[] arr={4,5,6,3,7,5,1,2,8,9,4,3,1,6,2,7,9,1};

        Set<Integer> tekrarsizSet=new HashSet<>();

        for (int each:arr
             ) {
            tekrarsizSet.add(each);

        }
        System.out.println(tekrarsizSet);
        
        int [] tekrarsizArr=new int[tekrarsizSet.size()];

        int i=0;
        for (int each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;

        }
        System.out.println(Arrays.toString(tekrarsizArr));

        arr=tekrarsizArr;
        System.out.println("Array'in son hali"+Arrays.toString(arr));
    }
}
