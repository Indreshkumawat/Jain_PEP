package DSA.LL;
class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLL {
    public static void traverseForw(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void traverseBack(Node head){

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }

    }
    public static void main(String[] args){
        Node head = null;
        Node n1 = new Node(10);

        head = n1;

        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n2.prev = n1;
        n3.next = n4;
        n3.prev = n2;
        n4.prev = n3;

        traverseForw(head);
        System.out.println();
        traverseBack(head);








    }
}
