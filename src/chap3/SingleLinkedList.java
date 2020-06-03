package chap3;

public class SingleLinkedList {
     Node head = new Node();

    public void add(int i) {
        Node node = new Node();
        node.value = i;
        node.next = head;
        head = node;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       Node tmp = head.next;
       while(tmp != null) {
           sb.append(tmp.value).append(" ");
           tmp = tmp.next;
       }
       return sb.toString();
    }

    class Node {
         Integer value;
         Node next;
    }
}
