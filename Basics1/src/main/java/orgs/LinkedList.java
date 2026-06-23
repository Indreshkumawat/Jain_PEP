package orgs;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node addInStart(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }
    public static void addAtLast(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void addAtPos(Node head,int pos,int data){
        Node newNode = new Node(data);
        Node curr = head;
        int count = 1;
        while(count < pos -1){
            curr = curr.next;
            count++;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }
    public static void main(String[] args){
        Node head = null;

        head = addInStart(head,20);
        head = addInStart(head,10);
        display(head);
        addAtLast(head,30);
        addAtLast(head,40);
        addAtLast(head,50);
        display(head);

        System.out.println();
        addAtPos(head,4,35);
        display(head);


    }
}
