package CLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");
        myLinkedList.addFirst("0");
        myLinkedList.addLast("1");
        System.out.println(myLinkedList);

    }
}