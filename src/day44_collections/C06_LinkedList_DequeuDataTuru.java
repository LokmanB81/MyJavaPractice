package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeuDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4=new LinkedList();

        ll4.add("cavidan");
        ll4.add("selim");
        ll4.add("mesut");
        ll4.add("selim");
        ll4.add("kenan");

        ll4.removeLastOccurrence("selim");
        System.out.println(ll4);

        System.out.println(ll4.pop());
        System.out.println(ll4);
    }
}
