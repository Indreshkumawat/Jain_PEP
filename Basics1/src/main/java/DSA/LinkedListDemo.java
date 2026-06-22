package DSA;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListDemo {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node addInStart(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }
    public static void addAtLast(Node head,int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void main(String[] args){
        Node head = null;
        head = addInStart(head,10);

        head = addInStart(head,20);
        display(head);
        addAtLast(head,30);
        display(head);
    }
}
