package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList ll1=new LinkedList();

        List ll2=new LinkedList();

        Queue <String> ll3=new LinkedList();

        Deque <String> ll4=new LinkedList();

        ll2.add("berk");
        ll2.add("done");
        ll2.add("enes");
        ll2.add("ayse");

        System.out.println(ll2);// [berk, done, enes, ayse]

        System.out.println(ll2.remove(3));// ayse
        System.out.println(ll2);

        System.out.println(ll2.remove("kemal"));
        System.out.println(ll2.remove("enes"));

        System.out.println(ll2);

        System.out.println(ll2.spliterator());

        System.out.println(ll2.set(1, "serap")); // done
        System.out.println(ll2);

        ll1.add("berk");
        ll1.add("ismail");
      // System.out.println(ll2);
        ll2.retainAll(ll1);
        System.out.println(ll1);
        System.out.println(ll2);

        System.out.println(ll2.hashCode());// 3020251
        ll2.add("fatih");
        System.out.println(ll2.hashCode());// 190831485





    }
}
