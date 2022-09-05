package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3=new LinkedList();

        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("polat");
        ll3.add("kadir");

        System.out.println(ll3);

        System.out.println(ll3.remove());
        System.out.println(ll3);

        System.out.println(ll3.remove("polat"));
        System.out.println(ll3);

        System.out.println(ll3.element());
        System.out.println(ll3.peek());
        System.out.println(ll3.poll());
        System.out.println(ll3);

        Queue<String> ll4=new LinkedList();

       // System.out.println(ll4.element());
        System.out.println(ll4.peek());
        System.out.println(ll4.poll());

        System.out.println(ll3.offer("ali"));
        System.out.println(ll3);
        System.out.println(ll3.offer("sefa"));
        System.out.println(ll3);

        System.out.println(ll4.remove());
    }
}
