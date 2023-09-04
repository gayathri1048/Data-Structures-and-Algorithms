package DataStructures;

class Node1 {
    int item;
    Node1 next;
    public Node1(int item) {
        this.item=item;
    }
}

public class stackusingLinkedList {
    int size=0;
    Node1 head=null;
    Node1 tail=null;
    public void push(int item) {
        Node1 n1=new  Node1(item);
        if(size==0) {
            head=n1;
            tail=n1;
            size++;
        }
        else {
            tail.next=n1;
            n1.next=null;
            tail=n1;
            size++;
        }
    }
    public void deleteAtLast() {
        if(this.head==null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null) {
            head=null;
            return;
        }
//        No1de node=new Node();
        Node1 prevNode=this.head;
        Node1 current=this.head.next;
        while(current.next!=null) {
            prevNode=prevNode.next;
            current=current.next;
        }
        prevNode.next=null;
    }
    public void display() {
        Node1 current=this.head;
        for(int i=0;i<size;i++) {
            System.out.println(current.item +"->");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        stackusingLinkedList S=new stackusingLinkedList();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);
        S.display();
    }

}