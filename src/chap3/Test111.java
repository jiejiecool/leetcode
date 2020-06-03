package chap3;

import java.util.LinkedList;

public class Test111 {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);


        System.out.println(list);

        reverseBySelf(list);

        System.out.println(list);
    }


    public static void reverseBySelf(SingleLinkedList singleLinkedList){
        SingleLinkedList.Node head=singleLinkedList.head;
        if (head.next==null||head.next.next==null){
            return;
        }
        SingleLinkedList.Node temp=head.next.next;
        head.next.next=null;
        while (temp!=null){
            SingleLinkedList.Node cur=temp.next;
            temp.next=head.next;
            head.next=temp;
            temp=cur;
        }

    }
}
